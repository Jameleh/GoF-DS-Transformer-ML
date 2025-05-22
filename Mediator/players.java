package dp_assignment_3;

public abstract class players {
	
	private mediator m;
	private String n;
	private int s;
	
	players(String name, int strength)
	{
		this.n = name;
		this.s = strength;
	}
	
	public void add_party(mediator mediator)
	{
		this.m = mediator;
	}
	
	public void act(Actions action)
	{
		System.out.println(this.getN() + " [" + this.getS() + "]" + " " + action.getA());
		this.m.action(this, action);
	}
	
	public void responce(Actions action)
	{
		this.updateS(action.getC());
		System.out.println(this.getN() + " [" + this.getS() + "]" + " " + action.getR());
		if (this.s < 10) {
			System.out.println(this.getN() + " is about to die");
		}
		if(this.s < 8) {
			System.out.println("Abdullah iqbal");
			System.out.println("FA17-BSE-030");
		}
	}
	
	public String getN()
	{
		return this.n;
	}
	
	public int getS()
	{
		return this.s;
	}
	
	public void updateS(int damaged)
	{
		this.s -= damaged;
	}

}
