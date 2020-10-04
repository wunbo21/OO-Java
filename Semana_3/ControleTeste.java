package Semana_3;

public class ControleTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemoto controle = new ControleRemoto("");
		
		controle.ligar();
		controle.play();
		
		controle.desligar();
		controle.play();
		
		controle.setUsuario("Lucas");
		
		controle.ligar();
		controle.play();
		
		controle.diminuirVolume();
		
	}

}
