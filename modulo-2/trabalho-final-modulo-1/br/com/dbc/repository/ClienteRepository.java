package br.com.dbc.repository;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements Repositorio<Integer, Cliente> {

        @Override
        public Integer getProximoId(Connection connection) throws SQLException {
            String sql = "SELECT seq_cliente.nextval mysequence from DUAL";

            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            if (res.next()) {
                return res.getInt("mysequence");
            }

            return null;
        }

        @Override
        public Cliente adicionar(Cliente cliente) throws BancoDeDadosException {
            Connection con = null;
            try {
                con = ConexaoBancoDeDados.getConnection();

                Integer proximoId = this.getProximoId(con);
                cliente.setIdCliente(proximoId);

                String sql = "INSERT INTO CLIENTE\n" +
                        "(ID_CLIENTE, CPF, TELEFONE, ENDERECO, SALDO)\n" +
                        "VALUES(?, ?, ?, ?)\n";

                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, cliente.getIdCliente());
                stmt.setString(2, cliente.getCpf());
                stmt.setString(3, cliente.getTelefone());
                stmt.setString(4, cliente.getEndereco());
                stmt.setDouble(5, cliente.getSaldo());

                int res = stmt.executeUpdate();
                System.out.println("adicionarCliente.res=" + res);
                return cliente;
            } catch (SQLException e) {
                throw new BancoDeDadosException(e.getCause());
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    @Override
    public Cliente selecionar(Integer id) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            String sql = "SELECT * FROM CLIENTE C\n" +
                    "INNER JOIN USUARIO U ON (U.ID_USUARIO = C.ID_USUARIO)\n" +
                    "WHERE ID_CLIENTE = ?\n";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet res = stmt.executeQuery();
            if (res.next()) {
                return getCliente(res);
            }
            return null;
//            System.out.println("selecionarCliente.res=" + res);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BancoDeDadosException(e.getCause());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

        @Override
        public boolean remover(Integer id) throws BancoDeDadosException {
            Connection con = null;
            try {
                con = ConexaoBancoDeDados.getConnection();

                String sql = "DELETE FROM CLIENTE WHERE id_cliente = ?";

                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, id);

                // Executa-se a consulta
                int res = stmt.executeUpdate();
//                System.out.println("removerClientePorId.res=" + res);

                return res > 0;
            } catch (SQLException e) {
                throw new BancoDeDadosException(e.getCause());
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        @Override
        public boolean editar(Integer id, Cliente cliente) throws BancoDeDadosException {
            Connection con = null;
            try {
                con = ConexaoBancoDeDados.getConnection();

                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE CLIENTE SET ");
                sql.append(" cpf = ?,");
                sql.append(" telefone = ?,");
                sql.append(" endereco = ? ");
                sql.append(" saldo = ? ");
                sql.append(" WHERE id_cliente = ? ");

                PreparedStatement stmt = con.prepareStatement(sql.toString());

                stmt.setString(1, cliente.getCpf());
                stmt.setString(2, cliente.getTelefone());
                stmt.setString(3, cliente.getEndereco());
                stmt.setDouble(4, cliente.getSaldo());
                stmt.setInt(5, id);

                int res = stmt.executeUpdate();
//                System.out.println("editarCliente.res=" + res);

                return res > 0;
            } catch (SQLException e) {
                throw new BancoDeDadosException(e.getCause());
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public List<Cliente> listar() throws BancoDeDadosException {
            List<Cliente> clientes = new ArrayList<>();
            Connection con = null;
            try {
                con = ConexaoBancoDeDados.getConnection();
                Statement stmt = con.createStatement();

                String sql = "SELECT * FROM CLIENTE";

                ResultSet res = stmt.executeQuery(sql);

                while (res.next()) {
                    Cliente cliente = getCliente(res);
                    clientes.add(cliente);
                }
            } catch (SQLException e) {
                throw new BancoDeDadosException(e.getCause());
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return clientes;
        }

    private Cliente getCliente(ResultSet res) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setNome(res.getString("nome"));
        cliente.setIdCliente(res.getInt("id_cliente"));
        cliente.setCpf(res.getString("cpf"));
        cliente.setTelefone(res.getString("telefone"));
        cliente.setEndereco(res.getString("endereco"));
        cliente.setSaldo(res.getDouble("saldo"));
        return cliente;
    }
}
