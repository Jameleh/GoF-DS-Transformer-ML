package br.edu.univas.si8.dp;

public class CamisaComplemento implements Subject {
	
	private String text = "Complemento";
	
	public CamisaComplemento() { }
	
	public CamisaComplemento(String txt) { this.text += ": " + txt; }
	
	@Override
	public void request() {
		System.out.print(text);
	}
}
