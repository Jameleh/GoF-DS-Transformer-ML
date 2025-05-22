package designPatternState;

public class TestePedido {

	public static void main(String[] args) {
		
		// Criação de um objeto para teste
		Pedido pedido1 = new Pedido();
		
		// Modificação dos estados em que o objeto se encontra
		pedido1.aguardandoPagamento();
		pedido1.pagamentoAprovado();
		
		
		
		// Criação de um objeto para teste		
		Pedido pedido2 = new Pedido();
		
		// Modificação dos estados em que o objeto se encontra
		pedido2.aguardandoPagamento();
		pedido2.pagamentoRejeitado();
	}

}
