package br.com.alura.design.pattern.memento;

public class Estado {
	private Contrato contrato;

	public Estado(Contrato contrato){
		this.contrato = contrato;
	}
	
	public Contrato getContrato(){
		return contrato;
	}
}
