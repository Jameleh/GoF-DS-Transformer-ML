package statePattern;

public class EmptyBakingMachine implements BakingMachineState {

	 @Override
	  public void enterBread()
	  {
	    System.out.println("Bread inserted ....");

	  }

	  @Override
	  public void removeBread()
	  {

	    System.out.println("No Bread in Baking Machine. Cannot remove the Bread");
	  }

	  @Override
	  public void stanBy()
	  {
	    System.out.println("No Bread in Baking Machine. Cannot enter the Stand-By mode");

	  }
}
