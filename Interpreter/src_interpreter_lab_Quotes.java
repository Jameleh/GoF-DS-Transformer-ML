package interpreter.lab;


public class Quotes implements Expression {

	String str;
	
	public Quotes(String st) {
		this.str = st;
		
	}

	@Override
	public String interpret(Context context) {
		
		return context.replaceQuotes(str);
	}

	 

}
