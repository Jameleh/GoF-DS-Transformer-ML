package br.edu.univas.si8.dp;

public class Proxy implements Subject {
	
	private Subject cB = new CamisaBrasil();			// Camisa Brasil 
	private Subject cC = new CamisaComplemento();		// Camisa Complemento 
	
	public Proxy() {}
	
	public Proxy(CamisaBrasil cB) { this.cB = cB; }
	
	public Proxy(CamisaComplemento cC) { this.cC = cC; }
	
	public Proxy(CamisaBrasil cB, CamisaComplemento cC) { this.cB = cB; this.cC = cC; }
	
	@Override
	public void request() {
		
		this.cB.request();
		
		System.out.print(" + ");
		
		this.cC.request();
		
		System.out.println("\n");
	}
}
