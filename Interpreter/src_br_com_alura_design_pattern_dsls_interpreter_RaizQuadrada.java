package br.com.alura.design.pattern.dsls.interpreter;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao e) {
		this.expressao = e;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}

}