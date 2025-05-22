
public class Mathsingleton {
	private static Mathsingleton mathinstance;
	private int variable1;
	private int variable2;
	private Mathsingleton() {};
	
	public static Mathsingleton getInstance() {
		if(mathinstance == null) {
			mathinstance = new Mathsingleton();
			
		};
		return  mathinstance;
	};
	
	public int getVariable1() {
		return variable1;
	};

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	};

	public int getVariable2() {
		return variable2;
	};

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	};

	public int add(){
		return this.variable1 + this.variable2;     }   
	public  int subtract(){ 
		return this.variable1 - this.variable2;     }    
	public  int multiply(){
		return this.variable1 * this.variable2;     }    
	public  int divide(){
		return this.variable1 / this.variable2;     }
	
};
