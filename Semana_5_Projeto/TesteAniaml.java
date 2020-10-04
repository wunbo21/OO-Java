package Semana_5_Projeto;

public class TesteAniaml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ave a = new Ave();
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		Reptil r = new Reptil();
		Canguru c = new Canguru();
		Cachorro cachorro = new Cachorro();
		Tartaruga t = new Tartaruga();
		
		// Aves
		System.out.println("01) Aves: ");
		
		a.setPeso(2.5);
		System.out.println("Peso -> " + a.getPeso());
		a.setMembros(2);
		
		System.out.println("Membros -> " + a.getMembros());
		a.setIdade(4);
		
		System.out.println("Idade -> " + a.getIdade());
		
		a.locomover();
		a.alimentar();
		a.emitirSom();
		a.fazerNinho();
		
		// Mamíferos
		System.out.println("\n02) Mamifero: ");
		
		m.setPeso(85.3);
		System.out.println("Peso -> " + m.getPeso());
		m.setMembros(4);
		
		System.out.println("Membros -> " + m.getMembros());
		m.setIdade(8);
		
		System.out.println("Idade -> " + m.getIdade());
		
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		// Peixe
		System.out.println("\n03) Peixe: ");
		
		p.setPeso(7.5);
		System.out.println("Peso -> " +p.getPeso());
		p.setMembros(0);
		
		System.out.println("Membros -> " + p.getMembros());
		p.setIdade(1);
		
		System.out.println("Idade -> " + p.getIdade());
		
		p.locomover();
		p.alimentar();
		p.emitirSom();
		p.soltarBolha();
		
		// Réptil
		System.out.println("\n04) Réptil: ");
		
		r.setPeso(4.5);
		System.out.println("Peso -> " +r.getPeso());
		r.setMembros(4);
		
		System.out.println("Membros -> " + r.getMembros());
		r.setIdade(6);
		
		System.out.println("Idade -> " + r.getIdade());
		
		r.locomover();
		r.alimentar();
		r.emitirSom();
		
		// Canguru
		System.out.println("\n05) Canguru: ");
		
		c.setPeso(55.30);
		System.out.println("Peso -> " +c.getPeso());
		c.setMembros(2);
		
		System.out.println("Membros -> " + c.getMembros());
		c.setIdade(6);
		
		System.out.println("Idade -> " + c.getIdade());
		
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		
		// Cachorro
		System.out.println("\n06) Cachorro: ");
		
		cachorro.setPeso(3.94);
		System.out.println("Peso -> " +cachorro.getPeso());
		cachorro.setMembros(4);
		
		System.out.println("Membros -> " + cachorro.getMembros());
		cachorro.setIdade(5);
		
		System.out.println("Idade -> " + cachorro.getIdade());
		
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.abanarRabo();
		
	}

}
