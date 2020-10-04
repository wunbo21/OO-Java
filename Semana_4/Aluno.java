package Semana_4;

public class Aluno extends Pessoa {

	private String curso;
	private int matricula;
	
	// Curso
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// Matricula
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void cancerlarMatricula () {
		System.out.println(getNome() + " sua matrícula está cancelada");
	}
	
}
