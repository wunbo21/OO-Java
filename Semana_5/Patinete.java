package Semana_5;

public class Patinete extends Veiculo {

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Som do Patinete -> zzzzzzzz!!!");
	}

	@Override
	public int getRodas() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public void mostrarCor() {
		// TODO Auto-generated method stub
		System.out.println("Patinete -> Preto");
	}
	
	public void ligando() {
		System.out.println("Ligando o Patinete");
	}
	
	public void ligando(String chave) {
		System.out.println("Chave: " + chave + " ligou o patinete!");
	}
	
}