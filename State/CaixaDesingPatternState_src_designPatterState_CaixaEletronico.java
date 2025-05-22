package designPatterState;

public class CaixaEletronico {
	
	// Criação dos estados padrões em que o objeto pode se encontrar
	CaixaState comCartao;
	CaixaState semCartao;
	CaixaState comSenhaCorreta;
	CaixaState caixaSemValor;
	
	
	// Criação do atributo para a manipulação do estado do objeto
	CaixaState caixaState;
	
	
	// Criação dos valores genéricos de verificação para contextualização do exemplo
	int valorNoCaixa = 5000;
	boolean senhaInseridaCorreta = false;
	
	
	// Criação do construtor apontando os estados padrões relacionados com os states
	public CaixaEletronico() {
		
		comCartao = new ComCartao(this);
		semCartao = new SemCartao(this);
		comSenhaCorreta = new ComSenha(this);
		caixaSemValor = new SemValor(this);
		
		caixaState = semCartao;
		
		if(valorNoCaixa < 0) {
			caixaState = caixaSemValor; 
		}
	}
	
	
	// Set do atributo de manipulação do objeto
	void setCaixaState(CaixaState novoCaixaState) {
		caixaState = novoCaixaState;
	}
	
	
	// Set do valor genérico
	public void setValorNoCaixa(int novoValorNoCaixa) {
		valorNoCaixa = novoValorNoCaixa;
	}
	
	
	// Set dos métodos de state que estão em CaixaState
	public void inserirCartao() {
		caixaState.inserirCartao();
	}
	
	public void removerCartao() {
		caixaState.removerCartao();
	}
	
	public void inserirSenha(int senhaInserida) {
		caixaState.inserirSenha(senhaInserida);
	}
	
	public void saque(int valorSaque) {
		caixaState.saque(valorSaque);
	}
	
	
	// Verificação dos estados padrões em que o objeto pode se encontrar
	public CaixaState verificaComCartao() { 
		return comCartao; 
	}
	
	public CaixaState verificaSemCartao() { 
		return semCartao; 
	}
	
	public CaixaState verificaComSenha() { 
		return comSenhaCorreta; 
	}
	
	public CaixaState verificaValorCaixa() { 
		return caixaSemValor; 
	}
}
