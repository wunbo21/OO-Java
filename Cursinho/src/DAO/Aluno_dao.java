package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Aluno_dto;
import JDBC.ConnectionFactory;

public class Aluno_dao {
	
	Connection con = ConnectionFactory.getConnection();
	PreparedStatement stmt = null;

	public void create(Aluno_dto aluno) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO aluno(nome, matricula, endereco) VALUES (?, ?, ?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getMatricula());
			stmt.setString(3, aluno.getEndereco());	
			stmt.executeUpdate();
			System.out.println("[AlunoDao] Incluído com sucesso.");
		}catch(SQLException e) {
			System.out.println("Erro na tentativa de insercao"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
	}
}