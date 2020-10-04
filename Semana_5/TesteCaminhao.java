package Semana_5;

public class TesteCaminhao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaminhaoMercedez mercedez = new CaminhaoMercedez("Lucas");
		Patinete patinete = new Patinete();
		
		// Polimorfismo de Sobreposição
		mercedez.mostrarCor();
		mercedez.som();
		
		// Polimorfismo de Sobrecarga
		patinete.ligando();
		patinete.ligando("chave mestra");
	}

}
