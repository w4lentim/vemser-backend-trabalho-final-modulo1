package br.com.dbc.repository;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements  Repositorio<Integer, Cliente> {

        @Override
        public Integer getProximoId(Connection connection) throws SQLException {
            String sql = "SELECT seq_pessoa2.nextval mysequence from DUAL";

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

                String sql = "INSERT INTO PESSOA\n" +
                        "(ID_PESSOA, NOME, DATA_NASCIMENTO, CPF)\n" +
                        "VALUES(?, ?, ?, ?)\n";

                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, cliente.getIdCliente());
                stmt.setString(2, cliente.getCpf());
                stmt.setString(3, cliente.getTelefone());
                stmt.setString(4, cliente.getEndereco());

                int res = stmt.executeUpdate();
                System.out.println("adicionarPessoa.res=" + res);
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
        public boolean remover(Integer id) throws BancoDeDadosException {
            Connection con = null;
            try {
                con = ConexaoBancoDeDados.getConnection();

                String sql = "DELETE FROM CLIENTE WHERE id_cliente = ?";

                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, id);

                // Executa-se a consulta
                int res = stmt.executeUpdate();
                System.out.println("removerClientePorId.res=" + res);

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
                sql.append(" WHERE id_pessoa = ? ");

                PreparedStatement stmt = con.prepareStatement(sql.toString());

                stmt.setString(1, cliente.getCpf());
                stmt.setString(2, cliente.getTelefone());
                stmt.setString(3, cliente.getEndereco());
                stmt.setInt(4, id);

                // Executa-se a consulta
                int res = stmt.executeUpdate();
                System.out.println("editarPessoa.res=" + res);

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

                // Executa-se a consulta
                ResultSet res = stmt.executeQuery(sql);

                while (res.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(res.getInt("id_pessoa"));
                    cliente.setCpf(res.getString("cpf"));
                    cliente.setTelefone(res.getString("telefone"));
                    cliente.setEndereco(res.getString("endereco"));
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
    }
