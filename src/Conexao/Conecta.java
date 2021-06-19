package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
	    private Connection connection;
	    private final String DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    private final String LOCAL_SERVIDOR = "DESKTOP-7MD8PV3";
	    private final String BANCO_DE_DADOS = "Barbearia";
	    private final String PORTA_BANCO = "1433";
	    private final String USUARIO = "ribeiro";
	    private final String SENHA = "123123";

	    public Connection conectar() throws Exception {
	        return this.conectarSqlServer();
	    }

	    public void desconectar() throws SQLException {
	    	connection.close();
	    }	  

	    private Connection conectarSqlServer() throws Exception {
	        Class.forName(DRIVER_SQLSERVER);
	        String url = "jdbc:sqlserver://"+LOCAL_SERVIDOR+":"+PORTA_BANCO+";DatabaseName="+BANCO_DE_DADOS;
	        connection = DriverManager.getConnection(url, USUARIO, SENHA);
	        return connection;
	    }
}
