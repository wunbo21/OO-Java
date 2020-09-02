package Semana_2;

public class PedidoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item = new Item();
		Pedido cliente = new Pedido();
		
		cliente.nomeComprador = "Lucas Bernardes";
	
		item.desc = "Arroz";
		item.quantidade = 3;
		item.preco = (float)8.00;
		
		cliente.adicionar(item.desc, item.quantidade, item.preco);
		
		item.desc = "Feijao";
		item.quantidade = 10;
		item.preco = (float)4.00;
		
		cliente.adicionar(item.desc, item.quantidade, item.preco);
		
	}

}
