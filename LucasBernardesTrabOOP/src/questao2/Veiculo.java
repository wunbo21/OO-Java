package questao2;

public abstract class Veiculo {

	private String marca;
	private int velocidade_maxima;
	private int potencia;
	
	// Get and Set
	
	// Marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Velocidade Máxima
	public int getVelocidade_maxima() {
		return velocidade_maxima;
	}
	public void setVelocidade_maxima(int velocidade_maxima) {
		this.velocidade_maxima = velocidade_maxima;
	}
	
	// Potência
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}