package Semana_5_Projeto;

public abstract class Animal {

	private int idade;
	private double peso;
	private int membros;
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	
	// Get and Set
	
	// Idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// Peso
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Membros
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}

}