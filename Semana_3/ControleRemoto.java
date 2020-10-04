package Semana_3;

public class ControleRemoto implements IControlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	private String usuario;
	
	//Construtor, � executado quando a classe � instanciada
	public ControleRemoto(String nome_usuario) {
		// TODO Auto-generated constructor stub
		usuario = nome_usuario;
		if(usuario.isEmpty()) {
			usuario = "pessoa";
		}
		volume = 50;
	}
	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		ligado = true;
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		ligado = false;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (ligado) {
			tocando = true;
			System.out.println("Ol� "+ usuario + " o mp3 come�ar� a tocar ...");
		}
		else {
			System.out.println("Erro. Aparelho est� desligado.");
			tocando = false;
		}
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		tocando = false;
	}

	@Override
	public void aumentaVolume() {
		// TODO Auto-generated method stub
		if (volume < 100) {
			volume += 10;
			System.out.println("Volume atual: " + volume);
		}
		else
			System.out.println("Volume m�ximo atingido");
	}

	@Override
	public void diminuirVolume() {
		// TODO Auto-generated method stub
		if (volume > 0) {
			volume -= 10;
			System.out.println("Volume atual: " + volume);
		}
		else
			System.out.println("Volume m�nimo atingido");
	}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}