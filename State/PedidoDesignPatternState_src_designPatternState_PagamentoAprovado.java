package designPatternState;

public class PagamentoAprovado implements PedidoState {
	
	// Atribuição das respostas para os states
	@Override
	public void pagamentoAprovado() {
		System.out.println("O pedido já encontra-se com o pagamento aprovado!");	
	}

	@Override
	public void pagamentoRejeitado() {
		System.out.println("O pedido encontra-se com o pagamento aprovado! Não é possível rejeitá-lo.");
	}

	@Override
	public void aguardandoPagamento() {
		System.out.println("O pedido encontra-se com o pagamento aprovado! Não há saldo pendente.");
	}
	
	
	
}
