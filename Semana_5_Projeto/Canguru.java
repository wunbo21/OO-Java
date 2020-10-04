package Semana_5_Projeto;

public class Canguru extends Mamifero {

	// Métodos Herdados da Classe Mamífero
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	// Métodos próprios
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
	
}