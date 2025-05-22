package interpreter.lab;

public class Tabs implements Expression {

	String str;
	
	public Tabs(String st) {
		this.str = st;
		
	}

	@Override
	public String interpret(Context context) {
		
		return context.eliminateAmissTabs(str);
	}

}
