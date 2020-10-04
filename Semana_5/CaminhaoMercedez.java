package Semana_5;

public class CaminhaoMercedez extends Caminhao{

	private String marca;
	
	public CaminhaoMercedez() {
		marca = "Mecedez C800";
	}
	
	public CaminhaoMercedez(String nomeMotorista) {
		setNomeMotorista(nomeMotorista);
		marca = "Mecedez C800";
		System.out.println("Bom dia "+ nomeMotorista);
	}
	
	@Override
	public void mostrarCor() {
		// TODO Auto-generated method stub
		System.out.println("Caminhão Mercedez -> Prata");
	}
	
}