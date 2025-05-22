package designPatternState;

public class Pedido {
	
	// Criação dos estados padrões em que o objeto pode se encontrar
	PedidoState pagamentoAprovado;
	PedidoState pagamentoRejeitado;
	PedidoState aguardandoPagamento;
	
	
	// Criação do atributo para a manipulação do estado do objeto
	PedidoState pedidoState;
	
	
	// Criação do construtor apontando os estados padrões relacionados com os states
	public Pedido() {
		pagamentoAprovado = new PagamentoAprovado();
		pagamentoRejeitado = new PagamentoRejeitado();
		aguardandoPagamento = new AguardandoPagamento();
		
		pedidoState = aguardandoPagamento;
	}
	
	
	// Set do atributo de manipulação do objeto
	public void setPedidoState(PedidoState novoPedidoState) {
		pedidoState = novoPedidoState;
	}
	
	
	// Set dos métodos de state que estão em PedidoState
	public void pagamentoAprovado() {
		pedidoState.pagamentoAprovado();
	}
	
	public void pagamentoRejeitado() {
		pedidoState.pagamentoRejeitado();
	}
	
	public void aguardandoPagamento() {
		pedidoState.aguardandoPagamento();
	}
	
}
