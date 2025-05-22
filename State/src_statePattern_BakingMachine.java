package statePattern;

public class BakingMachine implements BakingMachineState {
	 private BakingMachineState bakingMachineSt;

	  public BakingMachine()
	  {
	    bakingMachineSt = new EmptyBakingMachine();
	  }

	  public BakingMachineState getBakingMachineState()
	  {
	    return bakingMachineSt;
	  }

	  public void setBakingMachineState( BakingMachineState bakingMachineSt )
	  {
	    this.bakingMachineSt = bakingMachineSt;
	  }

	  @Override
	  public void enterBread()
	  {
	    bakingMachineSt.enterBread();

	    if( bakingMachineSt instanceof EmptyBakingMachine )
	    {

	      BakingMachineState isBread = new BreadIsInserted();
	      setBakingMachineState(isBread);
	      System.out.println("Baking Machine current state is : "
	                      + bakingMachineSt.getClass().getName());
	    }

	  }

	  @Override
	  public void removeBread()
	  {
	    bakingMachineSt.removeBread();

	    if( bakingMachineSt instanceof BreadIsInserted )
	    {

	      BakingMachineState noDebitCardState = new EmptyBakingMachine();
	      setBakingMachineState(noDebitCardState);
	      System.out.println("Baking Machine current state is : "
	                      + bakingMachineSt.getClass().getName());
	    }

	  }

	  @Override
	  public void stanBy()
	  {
	    bakingMachineSt.stanBy();

	  }


}
