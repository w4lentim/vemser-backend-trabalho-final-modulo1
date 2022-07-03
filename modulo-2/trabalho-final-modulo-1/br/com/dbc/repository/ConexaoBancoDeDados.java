package br.com.dbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDeDados {
        private static final String SERVER = "10.0.20.80";
        private static final String PORT = "1521"; // Porta TCP padrão do Oracle
        private static final String DATABASE = "xe";

        // Configuração dos parâmetros de autenticação
        private static final String USER = "VEMSER_PEDRO";
        private static final String PASS = "ZEEngKgBeM";

        public static Connection getConnection() throws SQLException {
            try {
                String url = "jdbc:oracle:thin:@" + SERVER + ":" + PORT + ":" + DATABASE;

                // Abre-se a conexão com o Banco de Dados
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//10.0.20.80:1521/xe", USER, PASS);

                // sempre usar o schema vem_ser
                con.createStatement().execute("alter session set current_schema=VEMSER_PEDRO");

                return con;
            }catch ( SQLException e){
                System.out.println("DB failed: "+e);
            }

            return null;
        }
}
