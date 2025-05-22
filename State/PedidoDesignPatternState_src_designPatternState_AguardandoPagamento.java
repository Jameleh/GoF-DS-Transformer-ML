package designPatternState;

public class AguardandoPagamento implements PedidoState {
	
	// Atribuição das respostas para os states
	@Override
	public void pagamentoAprovado() {
		System.out.println("O pedido encontra-se aguardando pagamento! Não é possível aprová-lo enquanto houver saldo.");
	}

	@Override
	public void pagamentoRejeitado() {
		System.out.println("O pedido ainda encontra-se com o pagamento pendente!");
	}

	@Override
	public void aguardandoPagamento() {
		System.out.println("O pedido encontra-se com o pagamento pendente!");
	}

}
