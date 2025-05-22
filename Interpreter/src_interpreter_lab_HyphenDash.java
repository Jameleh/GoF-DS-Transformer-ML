package interpreter.lab;

 
public class HyphenDash implements Expression {

	String str;
	
	public HyphenDash(String st) {
		this.str = st;
		
	}



	 

	@Override
	public String interpret(Context context) {
		// TODO Auto-generated method stub
		return (context).replaceHyphen(str);
	}

}
