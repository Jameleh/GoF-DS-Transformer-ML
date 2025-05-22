package designPatternState;

public interface PedidoState {
	
	// Criação dos estados com os comportamentos que serão efetuados pelo objeto
	public void pagamentoAprovado();
	public void pagamentoRejeitado();
	public void aguardandoPagamento();
}
