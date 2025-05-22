package designPatterState;

public class TesteCaixaEletronico {
	public static void main(String[] args) {
		
		// Criação de um objeto para teste
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		
		// Modificação dos estados em que o objeto se encontra
		caixaEletronico.inserirCartao();
		caixaEletronico.removerCartao();
		caixaEletronico.inserirCartao();
		caixaEletronico.inserirSenha(1234);
		caixaEletronico.saque(5000);
		caixaEletronico.inserirCartao();
		caixaEletronico.inserirSenha(1234);
	}
}
