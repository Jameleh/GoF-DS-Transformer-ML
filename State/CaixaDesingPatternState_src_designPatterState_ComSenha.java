package designPatterState;

public class ComSenha implements CaixaState {
	
	// Instânciação da classe principal para manipulação
	CaixaEletronico caixaEletronico;
	
	
	// Criação do construtor passando o objeto principal como argumento
	public ComSenha(CaixaEletronico novoCaixaEletronico) {
		caixaEletronico = novoCaixaEletronico;
	}
	
	
	// Atribuição das respostas para os states
	@Override
	public void inserirCartao() {
		System.out.println("Já existe um cartão no caixa eletrônico. Não é possível inserir outro!");
	}

	@Override
	public void removerCartao() {
		System.out.println("Cartão ejetado!");
		caixaEletronico.setCaixaState(caixaEletronico.semCartao);
	}

	@Override
	public void inserirSenha(int senhaInserida) {
		System.out.println("Senha já inserida!");
	}

	@Override
	public void saque(int valorSaque) {
		if(valorSaque > caixaEletronico.valorNoCaixa) {
			System.out.println("Não há saldo disponível neste valor!");
			System.out.println("Cartão ejetado!");
			caixaEletronico.setCaixaState(caixaEletronico.semCartao);
		} else {
			System.out.println(valorSaque + " foi disponibilizado!");
			caixaEletronico.setValorNoCaixa(caixaEletronico.valorNoCaixa - valorSaque);
			System.out.println("Cartão ejetado!");
			caixaEletronico.setCaixaState(caixaEletronico.semCartao);
			
			if(caixaEletronico.valorNoCaixa <= 0) {
				caixaEletronico.setCaixaState(caixaEletronico.verificaValorCaixa());
			}
		}
	}
	
	
}
