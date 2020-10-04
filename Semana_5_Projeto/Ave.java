package Semana_5_Projeto;

public class Ave extends Animal{

	private String corPena;
	
	// M�todos Herdados da Classe Animal
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de Ave");
	}

	// M�todos da Classe Ave
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
		
	// Get and Set
	
	// Cor da Pena
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}