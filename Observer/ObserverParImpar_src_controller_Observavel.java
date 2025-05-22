package controller;

import java.util.Random;

public class Observavel implements IGeradorNumeroAleat, IObservavel {

	private Observador observador;
	private String acao;
	
	public Observavel(Observador observador) {
		this.observador = observador;
	}


	@Override
	public void notificaMudanca(String acao) {
		observador.update(acao);
	}

	@Override
	public void aleatorio() {
		Random random = new Random();
		int num = random.nextInt(1001);
		System.out.println("O numero gerado foi: " + num);
		if(num % 2 == 0)
			acao = "par";
		else
			acao = "impar";
		notificaMudanca(acao);
	}

}
