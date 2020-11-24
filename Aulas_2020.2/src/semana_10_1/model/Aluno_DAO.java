package semana_10_1.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Semana_10.jdbc.ConnectionFactory;
import semana_10_1.bo.Aluno;

public class Aluno_DAO {

	public void create(Aluno aluno) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into aluno(username, matricula, email, password) values(?, ?, ?, ?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getUsername());
			stmt.setString(2, aluno.getMatricula());
			stmt.setString(3, aluno.getEmail());
			stmt.setString(4, aluno.getPassword());	
			stmt.executeUpdate();
			System.out.println("[AlunoDao] Incluído com sucesso.");
		}catch (SQLException e){
			System.out.println("Erro na tentativa de insercao"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	public List<Aluno> read() {	
		List<Aluno> listAlunos = new ArrayList<Aluno>();
		// Ler banco mysql e preencher lista de alunos
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null; 
		String sql = "SELECT * FROM poo_av2.aluno";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setUsername(rs.getString("username"));
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setEmail(rs.getString("email"));
				listAlunos.add(aluno);
			}
		} catch(SQLException e) {
			System.out.println("<Aluno_DAO> Erro lendo o banco");
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
		return listAlunos;
	}

	public void update(Aluno aluno) {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "UPDATE aluno SET username = ?, matricula = ?, email= ? where id = ? limit 1";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getUsername());
			stmt.setString(2, aluno.getMatricula());
			stmt.setString(3, aluno.getEmail());
			stmt.setInt(4, aluno.getId());
			stmt.executeUpdate();
			System.out.println("[AlunoDao] Alteração feita com sucesso.");
		}catch (SQLException e){
			System.out.println("Erro na tentativa de alteração"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "DELETE FROM aluno WHERE id = ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("[AlunoDao] Aluno excluído com sucesso.");
		}catch (SQLException e){
			System.out.println("Erro na tentativa de exclusão"+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con);
		}
	}	
}