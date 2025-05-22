package dp_strategy;

public class Disciplina {
	private double Media, P1, P2;
	private String Nome;
	private ICalcMedia calcMedia;
	
	public void setCalcMedia(ICalcMedia c) {
		this.calcMedia = c;
	}
	
	public void setNome(String n) {
		this.Nome = n;
	}
	
	public void setP1(double p) {
		this.P1 = p;
	}
	
	public void setP2(double p) {
		this.P2 = p;
	}
	
	public void setMedia(double m) {
		this.Media = m;
	}
	
	public ICalcMedia getCalcMedia() {
		return calcMedia;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public double getP1() {
		return P1;
	}
	
	public double getP2() {
		return P2;
	}
	
	public double getMedia() {
		return Media;
	}
	
	Disciplina(){}
	
	Disciplina(ICalcMedia calcMedia){
		this.calcMedia = calcMedia;
	}
	
	public void CalcularMedia() {
		this.Media = calcMedia.CalculaMedia(P1, P2);		
	}
	
	public String Situacao() {
		return calcMedia.Situacao(Media);
	}
	
	
}
