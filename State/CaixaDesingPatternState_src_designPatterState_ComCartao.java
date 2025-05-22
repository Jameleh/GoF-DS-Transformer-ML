package designPatterState;

public class ComCartao implements CaixaState {
	
	// Instânciação da classe principal para manipulação
	CaixaEletronico caixaEletronico;
	
	
	// Criação do construtor passando o objeto principal como argumento
	public ComCartao(CaixaEletronico novoCaixaEletronico) {
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
		if(senhaInserida == 1234) {
			System.out.println("Senha correta!");
			caixaEletronico.senhaInseridaCorreta = true;
			caixaEletronico.setCaixaState(caixaEletronico.comSenhaCorreta);
		} else {
			System.out.println("Senha incorreta!");
			caixaEletronico.senhaInseridaCorreta = true;
			System.out.println("Cartão ejetado!");
			caixaEletronico.setCaixaState(caixaEletronico.semCartao);
		}
	}

	@Override
	public void saque(int valorSaque) {
		System.out.println("Insira sua senha primeiro.");
	}

}
