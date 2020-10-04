package Semana_5_Projeto;

public class Peixe extends Animal {

	// Métodos Herdados da Classe Animal
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Substâncias");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe não emite som");
	}
	
	// Métodos da Classe Peixe
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
}