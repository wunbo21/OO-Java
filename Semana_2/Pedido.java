package Semana_2;

public class Pedido {
	
	String nomeComprador;
	float valorCompra = 0;
	
	void adicionar (String nome, int quantidade, float valor) {
		System.out.println("Item: "+nome);
		System.out.println("Quantidade: "+quantidade);
		valor = valor * quantidade;
		valorCompra += valor;
		
		float precoFinal = mostraValorTotal();
		System.out.println("Total da compra = "+precoFinal);
	}
	
	float mostraValorTotal() {
		return valorCompra;
	}
	
}
