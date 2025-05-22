package designPatterState;

public class SemValor implements CaixaState {
	
	// Instânciação da classe principal para manipulação
	CaixaEletronico caixaEletronico;
	
	
	// Criação do construtor passando o objeto principal como argumento
	public SemValor(CaixaEletronico novoCaixaEletronico) {
		caixaEletronico = novoCaixaEletronico;
	}
	
	
	// Atribuição das respostas para os states
	@Override
	public void inserirCartao() {
		System.out.println("Não há saldo disponível!");
	}

	@Override
	public void removerCartao() {
		System.out.println("Não há saldo disponível. O catão não foi inserido!");
	}

	@Override
	public void inserirSenha(int senhaInserida) {
		System.out.println("Não há saldo disponível!");
	}

	@Override
	public void saque(int valorSaque) {
		System.out.println("Não há saldo disponível!");
	}
	
	
}
