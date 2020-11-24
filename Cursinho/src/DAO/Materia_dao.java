package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Materia_dto;
import JDBC.ConnectionFactory;

public class Materia_dao {

	Connection con = ConnectionFactory.getConnection();
	PreparedStatement stmt = null;
	
	public void create(Materia_dto materia) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO materia(nome, carga_horaria, cod) VALUES (?, ?, ?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, materia.getNome());
			stmt.setInt(2, materia.getCarga_Horaria());
			stmt.setString(3, materia.getCodigo_Materia());	
			stmt.executeUpdate();
			System.out.println("[MateriaDao] Incluída com sucesso.");
		}catch(SQLException e) {
			System.out.println("Erro na tentativa de insercao"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
	}
}