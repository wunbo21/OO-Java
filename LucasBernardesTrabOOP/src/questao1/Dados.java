package questao1;

public class Dados {

	public void mostrar(int num) {
		if(num % 2 == 0)
			System.out.println("� par.");
		else
			System.out.println("� �mpar");
	}
	
	public void mostrar(String texto) {
		System.out.println("O tamanho da string � " + texto.length());
	}
	
}