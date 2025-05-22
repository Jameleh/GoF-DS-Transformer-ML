package interpreter.lab;


public class ManySpaces implements Expression {
	
	String str;
	
	public ManySpaces(String st) {
		this.str = st;
		
	}

	@Override
	public String interpret(Context context) {
		
		return context.eliminateManySpaces(str);
	}

	 
}

