package designPatterState;

public interface CaixaState {
	
	// Criação dos estados com os comportamentos que serão efetuados pelo objeto
	
	void inserirCartao();
	void removerCartao();
	void inserirSenha(int senhaInserida);
	void saque(int valorSaque);
	
}
