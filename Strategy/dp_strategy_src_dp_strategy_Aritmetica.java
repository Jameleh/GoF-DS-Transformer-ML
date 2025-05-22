package dp_strategy;

public class Aritmetica implements ICalcMedia {
	@Override
	
	public double CalculaMedia(double a, double b) {return (a + b) / 2;}
	
	@Override
	public String Situacao(double media){
		if (media >= 7.0) {return "Aprovado";}
	    else {return "Reprovado";}
	}
}