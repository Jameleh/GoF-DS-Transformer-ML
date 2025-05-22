package interpreter.lab;


public class AmissSpaces implements Expression {
	
	String str;
	
	public AmissSpaces(String st) {
		this.str = st;
		
	}

	@Override
	public String interpret(Context context) {
		
		return context.eliminateAmissSpaces(str);
	}	

}
