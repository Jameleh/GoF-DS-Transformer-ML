package net.memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		CareTaker c = new CareTaker();
		
		o.setState("State 1");
		c.add(o.saveState());
		o.setState("State 2");
		c.add(o.saveState());
		o.setState("State 3");
		c.add(o.saveState());
		
		c.showList();

		o.restoreState(c.get(1));
		c.add(o.saveState());
	}

}
