package Semana_5_Projeto;

public class Cachorro extends Mamifero{

	// Métodos próprios
	public void enterrarOsso() {
		System.out.println("Enterrando Osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	
	// Métodos da Classe Mamifero
	@Override
	public void emitirSom() {
		System.out.println("Au au");
	}
	
}