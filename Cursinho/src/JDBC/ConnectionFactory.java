package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/curso?useTimezone=true&serverTimezone=UTC"; 
	private static final String USER = "root"; 
	private static final String SENHA = ""; 
	
	
	public static Connection getConnection() {
        try {
        	// Class.forName(DRIVER); opcional dependendo da versao
            return DriverManager.getConnection(URL, USER, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o Banco de Dados!",e);
        }
	}
	
	public static void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}