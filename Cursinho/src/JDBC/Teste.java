package JDBC;

import java.sql.Connection;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.getConnection();
        
 		System.out.println("Conex�o est� Supimpa.");
	}
}