package br.com.dbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDeDados {
        private static final String SERVER = "10.0.20.80";
        private static final String PORT = "1521"; // Porta TCP padrão do Oracle
        private static final String DATABASE = "xe";

        // Configuração dos parâmetros de autenticação
        private static final String USER = "VEMSER_WILLIAN";
        private static final String PASS = "GaMXtyWKOB";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@" + SERVER + ":" + PORT + ":" + DATABASE;

        // Abre-se a conexão com o Banco de Dados
        Connection con = DriverManager.getConnection(url, USER, PASS);

        // sempre usar o schema vem_ser
        con.createStatement().execute("alter session set current_schema=VEMSER_WILLIAN");

        return con;
    }
}
