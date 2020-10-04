package Semana_4;

public class Professor extends Pessoa {

	private String especialidade;
	private float salario;
	
	// Especialidade
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	// Salário
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario () {
		salario *= 2;
	}
	
}
