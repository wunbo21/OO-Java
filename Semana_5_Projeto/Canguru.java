package Semana_5_Projeto;

public class Canguru extends Mamifero {

	// M�todos Herdados da Classe Mam�fero
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	// M�todos pr�prios
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
	
}