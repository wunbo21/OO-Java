package questao2;

public class Carro extends Veiculo{

	public Carro() {
		super.setVelocidade_maxima(150);
		super.setPotencia(130);
	}
	
	public void mostrarMarca() {
		System.out.println("Não tem marca definida");
	}
}