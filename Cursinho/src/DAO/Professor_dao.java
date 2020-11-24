package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Professor_dto;
import JDBC.ConnectionFactory;

public class Professor_dao {
	
	Connection con = ConnectionFactory.getConnection();
	PreparedStatement stmt = null;

	public void create(Professor_dto professor) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO professor(nome, matricula, endereco, cod_materia) VALUES (?, ?, ?, ?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, professor.getNome());
			stmt.setString(2, professor.getMatricula());
			stmt.setString(3, professor.getEndereco());
			stmt.setString(4, professor.getCodigo_Materia());
			stmt.executeUpdate();
			System.out.println("[ProfessorDao] Incluído com sucesso.");
		}catch(SQLException e) {
			System.out.println("Erro na tentativa de insercao"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
	}

}