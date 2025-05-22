package designPatterState;

public class SemCartao implements CaixaState {
	
	// Instânciação da classe principal para manipulação
	CaixaEletronico caixaEletronico;
	
	
	// Criação do construtor passando o objeto principal como argumento
	public SemCartao(CaixaEletronico novoCaixaEletronico) {
		caixaEletronico = novoCaixaEletronico;
	}
	
	
	// Atribuição das respostas para os states
	@Override
	public void inserirCartao() {
		System.out.println("Por favor, digite sua senha.");
		caixaEletronico.setCaixaState(caixaEletronico.comCartao);
		
	}

	@Override
	public void removerCartao() {
		System.out.println("Por favor, insira o cartão primeiro.");
	}

	@Override
	public void inserirSenha(int senhaInserida) {
		System.out.println("Por favor, insira o cartão primeiro.");
		
	}

	@Override
	public void saque(int valorSaque) {
		System.out.println("Por favor, insira o cartão primeiro.");
	}
}
