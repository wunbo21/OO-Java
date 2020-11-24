package semana_10_1.controller;

import java.util.ArrayList;
import java.util.List;

import semana_10_1.bo.Aluno;
import semana_10_1.model.Aluno_DAO;

public class Aluno_controller {
	//Criar nova instância
	public void create(Aluno aluno) {
		Aluno_DAO model = new Aluno_DAO();
		model.create(aluno);
	}
	// Criar uma lista e colocar todas as instâncias do BD
	public List<Aluno> read() {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		try {
			Aluno_DAO model = new Aluno_DAO();
			listaAlunos = model.read();
		}catch(Exception e) {
			System.out.println("<controller> Erro ao tentar ler alunos");
		}
		return listaAlunos;
	}
	public void update(Aluno aluno) {
		// TODO Auto-generated method stub
		Aluno_DAO model = new Aluno_DAO();
		model.update(aluno);
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		Aluno_DAO model = new Aluno_DAO();
		model.delete(id);
	}
	
}