package cores;

public class Verde implements Cores {

	private String forma;
	private String cor = "verde";
	
	@Override
	public String getColor() {
		return (this.forma+" "+this.cor);
	}

	@Override
	public void setColor(String forma) {
		this.forma = forma;
	}

	
}

