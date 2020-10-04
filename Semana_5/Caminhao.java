package Semana_5;

public class Caminhao extends Veiculo {

	private String nomeMotorista;
	
	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Som do Caminhão -> Vrummmmmm!!!!");
	}

	@Override
	public int getRodas() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public void mostrarCor() {
		// TODO Auto-generated method stub
		System.out.println("Não tem cor definida.");
	}
	
	// Get and Set

	// Nome Motorista
	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

}