package cores;

public class Azul implements Cores {

	private String forma;
	private String cor = "azul";
	
	@Override
	public String getColor() {
		return (this.forma+" "+this.cor);
	}

	@Override
	public void setColor(String forma) {
		this.forma = forma;
	}

	
}

