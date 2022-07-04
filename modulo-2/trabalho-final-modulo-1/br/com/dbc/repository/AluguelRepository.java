package br.com.dbc.repository;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Aluguel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AluguelRepository implements Repositorio<Integer, Aluguel> {
    @Override
    public Integer getProximoId(Connection connection) throws SQLException {
        String sql = "SELECT seq_aluguel.nextval mysequence from DUAL";

        Statement stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery(sql);

        if (res.next()) {
            return res.getInt("mysequence");
        }
        return null;
    }

    @Override
    public Aluguel selecionar(Integer id) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            String sql = "SELECT id_cliente FROM ALUGUEL WHERE id_cliente = ? ";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

//            System.out.println("clienteSelecionadoPorId.res = " + res);
            ResultSet res = stmt.executeQuery(sql);

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
        return null;
    }

    @Override
    public Aluguel adicionar(Aluguel aluguel) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            Integer proximoId = this.getProximoId(con);
            aluguel.setIdAluguel(proximoId);

            String sql = "INSERT INTO ALUGUEL\n" +
                    "(ID_ALUGUEL, ID_CLIENTE, ID_CARRO, diaDoAluguel, diaDaEntrega)\n" +
                    "VALUES(?, ?, ?, ?, ?)\n";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, aluguel.getIdAluguel());
            stmt.setInt(2, aluguel.getCliente().getIdCliente());
            stmt.setInt(3, aluguel.getCarro().getIdCarro());
            stmt.setInt(4, aluguel.getDiaDoAluguel());
            stmt.setInt(5, aluguel.getDiaDaEntrega());


            int res = stmt.executeUpdate();
//            System.out.println("adicionarAluguel.res=" + res);
            return aluguel;
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

            String sql = "DELETE FROM ALUGUEL WHERE id_aluguel = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            int res = stmt.executeUpdate();

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
    public boolean editar(Integer id, Aluguel aluguel) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE ALUGUEL SET ");
            sql.append(" Dia do Aluguel = ?,");
            sql.append(" Dia da Entrega = ?,");
            sql.append((" WHERE id_aluguel = ? "));

            PreparedStatement stmt = con.prepareStatement(sql.toString());

            stmt.setInt(1, aluguel.getCliente().getIdCliente());
            stmt.setInt(2, aluguel.getCarro().getIdCarro());
            stmt.setInt(3, aluguel.getDiaDoAluguel());
            stmt.setInt(4, aluguel.getDiaDaEntrega());
            stmt.setInt(5, id);

            int res = stmt.executeUpdate();
//            System.out.println("editarAluguel.res=" + res);

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
    public List<Aluguel> listar() throws BancoDeDadosException {
        List<Aluguel> alugueis = new ArrayList<>();
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM ALUGUEL";

            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                Aluguel aluguel = new Aluguel();
                aluguel.setIdAluguel(res.getInt("id_Aluguel"));
                aluguel.getCliente().setIdCliente(res.getInt("id_cliente"));
                aluguel.getCarro().setIdCarro(res.getInt("id_carro"));
                aluguel.setDiaDoAluguel(res.getInt("diaDoAluguel"));
                aluguel.setDiaDaEntrega(res.getInt("diaDaEntrega"));
                alugueis.add(aluguel);
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
        return alugueis;
    }
}
