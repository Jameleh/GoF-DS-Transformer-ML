package interpreter.lab;


public class LineFeeds implements Expression {

	String str;
	
	public LineFeeds(String st) {
		this.str = st;
		
	}


	@Override
	public String interpret(Context context) {
		// TODO Auto-generated method stub
		return context.eliminateLineFeeds(str);
	}

}
