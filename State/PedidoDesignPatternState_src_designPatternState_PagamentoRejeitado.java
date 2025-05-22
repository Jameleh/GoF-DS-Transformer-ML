package designPatternState;

public class PagamentoRejeitado implements PedidoState {
	
	// Atribuição das respostas para os states
	@Override
	public void pagamentoAprovado() {
		System.out.println("O pedido encontra-se com o pagamento rejeitado! Não é possível aprová-lo.");
	}

	@Override
	public void pagamentoRejeitado() {
		System.out.println("O pedido já encontra-se com o pagamento rejeitado!");
	}

	@Override
	public void aguardandoPagamento() {
		System.out.println("O pedido encontra-se com o pagamento rejeitado! Não há saldo pendente.");
	}

}
