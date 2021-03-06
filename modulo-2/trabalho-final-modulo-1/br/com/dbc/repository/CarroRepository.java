package br.com.dbc.repository;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Aluguel;
import br.com.dbc.model.Carro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroRepository implements  Repositorio<Integer, Carro> {

    @Override
    public Integer getProximoId(Connection connection) throws SQLException {
        String sql = "SELECT seq_carro.nextval mysequence from DUAL";

        Statement stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery(sql);

        if (res.next()) {
            return res.getInt("mysequence");
        }
        return null;
    }
    @Override
    public Carro selecionar(Integer id) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            String sql = "SELECT * FROM CARRO WHERE id_carro = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet res = stmt.executeQuery();
            if (res.next()) {
                return getCarro(res);
            }
            return null;
//            System.out.println("carroSelecionadoPorId.res = " + res);

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
    public Carro adicionar(Carro carro) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            Integer proximoId = this.getProximoId(con);
            carro.setIdCarro(proximoId);

            String sql = "INSERT INTO CARRO\n" +
                    "(ID_CARRO, ALUGADO, NOME, MARCA, CLASSE, QUANTIDADE_PASSAGEIROS, KM_RODADOS, PRECO_DIARIA)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?)\n";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, carro.getIdCarro());
            stmt.setString(2, carro.getAlugado());
            stmt.setString(3, carro.getNomeCarro());
            stmt.setString(4, carro.getMarca());
            stmt.setString(5, carro.getClasse());
            stmt.setInt(6, carro.getQntPassageiros());
            stmt.setInt(7, carro.getKmRodados());
            stmt.setDouble(8, carro.getPrecoDiaria());

            int res = stmt.executeUpdate();
//            System.out.println("adicionarCarro.res=" + res);
            return carro;
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

            String sql = "DELETE FROM CARRO WHERE id_carro = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            int res = stmt.executeUpdate();
//            System.out.println("removerCarroPorId.res=" + res);

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

    public boolean editarAlugado(Integer id, Boolean alugado) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE CARRO SET ");
            sql.append(" Alugado = ? ");
            sql.append(" WHERE id_carro = ? ");

            PreparedStatement stmt = con.prepareStatement(sql.toString());

            stmt.setString(1, alugado ? "S" : "N");
            stmt.setInt(2, id);

            int res = stmt.executeUpdate();
//            System.out.println("editarCarro.res=" + res);

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
    public boolean editar(Integer id, Carro carro) throws BancoDeDadosException {
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE CARRO SET ");
            sql.append(" Alugado = ?,");
            sql.append(" Nome do Carro = ?,");
            sql.append(" Marca = ? ");
            sql.append(" Classe = ? ");
            sql.append(" Quantidade de passageiros = ? ");
            sql.append(" Kil??metros Rodados ? ");
            sql.append(" Valor Di??ria = ? ");
            sql.append(" WHERE id_carro = ? ");

            PreparedStatement stmt = con.prepareStatement(sql.toString());

            stmt.setString(1, carro.getAlugado());
            stmt.setString(2, carro.getNomeCarro());
            stmt.setString(3, carro.getMarca());
            stmt.setString(4, carro.getClasse());
            stmt.setInt(5, carro.getQntPassageiros());
            stmt.setInt(6, carro.getKmRodados());
            stmt.setDouble(7, carro.getPrecoDiaria());
            stmt.setInt(8, id);

            int res = stmt.executeUpdate();
//            System.out.println("editarCarro.res=" + res);

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
    public List<Carro> listar() throws BancoDeDadosException {
        List<Carro> carros = new ArrayList<>();
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM CARRO";

            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                Carro carro = getCarro(res);
                carros.add(carro);
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
        return carros;
    }

    private Carro getCarro(ResultSet res) throws SQLException {
        Carro carro = new Carro();
        carro.setIdCarro(res.getInt("id_carro"));
        carro.setNomeCarro(res.getString("nome"));
        carro.setAlugado(res.getString("alugado"));
        carro.setMarca(res.getString("marca"));
        carro.setClasse(res.getString("classe"));
        carro.setQntPassageiros(res.getInt("quantidade_passageiros"));
        carro.setKmRodados(res.getInt("km_rodados"));
        carro.setPrecoDiaria(res.getDouble("preco_diaria"));
        return carro;
    }

    public List<Carro> listarNaoAlugaDos() throws BancoDeDadosException {
        List<Carro> carros = new ArrayList<>();
        Connection con = null;
        try {
            con = ConexaoBancoDeDados.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM CARRO\n" +
                          "WHERE ALUGADO = 'N'";

            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                Carro carro = getCarro(res);
                carros.add(carro);
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
        return carros;
    }
}
