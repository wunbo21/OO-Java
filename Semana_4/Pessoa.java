package Semana_4;

public abstract class Pessoa {
	
	private String nome;
	private String sexo;
	private int idade;
	
	// Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Sexo
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	// Idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void aniversario () {
		System.out.println("Parabéns "+ nome);
	}
	
}