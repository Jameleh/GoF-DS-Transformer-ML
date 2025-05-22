package cores;

public class Vermelho implements Cores {

	private String forma;
	private String cor = "vermelho";
	
	@Override
	public String getColor() {
		return (this.forma+" "+this.cor);
	}

	@Override
	public void setColor(String forma) {
		this.forma = forma;
	}

	
}

