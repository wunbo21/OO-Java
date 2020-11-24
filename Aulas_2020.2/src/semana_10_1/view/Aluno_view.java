package semana_10_1.view;

import java.util.Scanner;

import semana_10_1.bo.Aluno;
import semana_10_1.controller.Aluno_controller;

public class Aluno_view {
	
	public void create() {
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Aluno_controller controler = new Aluno_controller();
		// Entrada de dados
		System.out.println("Entre com o nome de usuário: ");
		aluno.setUsername(in.next());
		System.out.println("Entre com a matrícula: ");
		aluno.setMatricula(in.next());
		System.out.println("Entre com o e-mail: ");
		aluno.setEmail(in.next());
		System.out.println("Entre com a senha: ");
		aluno.setPassword(in.next());
		// Passar aluno para controller
		controler.create(aluno);
	}
	
	public void read() {
		Aluno_controller controller = new Aluno_controller();	
		System.out.println("Listagem de Alunos");
		System.out.println("************************************");
		for(Aluno aluno:controller.read()) {
			System.out.println("Id: "+ aluno.getId());
			System.out.println("Username: "+ aluno.getUsername());
			System.out.println("Matrícula: "+ aluno.getMatricula());
			System.out.println("Email: "+ aluno.getEmail());
			System.out.println("--------------------------------------------------");
		}
	}
	
	public void update() {
		
		Scanner in = new Scanner(System.in);
		Aluno_view aluno_crud = new Aluno_view();
		Aluno aluno = new Aluno();
		Aluno_controller controller = new Aluno_controller();
		
		aluno_crud.read();
		
		System.out.println("Id que será modificado");
		aluno.setId(in.nextInt());
		System.out.println("Entre com o nome de usuário: ");
		aluno.setUsername(in.next());
		System.out.println("Entre com a matrícula: ");
		aluno.setMatricula(in.next());
		System.out.println("Entre com o e-mail: ");
		aluno.setEmail(in.next());
		
		controller.update(aluno);
	}
	
	public void delete() {
		
		Scanner in = new Scanner(System.in);
		Aluno_view aluno_crud = new Aluno_view();
		Aluno_controller controller = new Aluno_controller();
		
		int id;

		aluno_crud.read();
		System.out.println("Id que será modificado");
		id = in.nextInt();
		
		controller.delete(id);
	}

	public static void main(String[] args) {		
		Aluno_view aluno_crud = new Aluno_view();
		int continuar = 1;
		while(continuar != 0) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Exibir Alunos");
			System.out.println("3 - Modificar Aluno");
			System.out.println("4 - Deletar Aluno");
			System.out.println("0 - Sair\n");
			
			Scanner in = new Scanner(System.in);
			System.out.println("\nEscolha: ");
			continuar = in.nextInt();
			
			if(continuar == 1)
				aluno_crud.create();
			else if(continuar == 2)
				aluno_crud.read();
			else if(continuar == 3) {
				aluno_crud.update();
			}			
			else if(continuar == 4)
				aluno_crud.delete();
		}
			System.out.println("Fim de Cadastro");
	}
}





























