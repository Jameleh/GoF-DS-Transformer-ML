package statePattern;

public class BreadIsInserted implements BakingMachineState {

	 @Override
	  public void enterBread()
	  {
	    System.out.println("Bread is already inside the machine.You cannot add another one");

	  }

	  @Override
	  public void removeBread()
	  {

	    System.out.println("Bread is removed");
	  }

	  @Override
	  public void stanBy()
	  {
	    System.out.println("Baking machine is on Stand-By mode ");

	  }

}
