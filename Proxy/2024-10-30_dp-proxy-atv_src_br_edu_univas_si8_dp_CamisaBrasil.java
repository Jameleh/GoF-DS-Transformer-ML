package br.edu.univas.si8.dp;

public class CamisaBrasil implements Subject {
	
	private String text = "Camisa do Brasil";
	
	public CamisaBrasil() { }
	
	public CamisaBrasil(String txt) { this.text += ": " + txt; }
	
	@Override
	public void request() {
		System.out.print(text);
	}
}
