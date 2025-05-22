package statePattern;

public class TestBreadMachine {

	public static void main(String[] args) {
		 BakingMachine bread = new BakingMachine();

		    System.out.println("Baking Machine Current state is : "
		                    + bread.getBakingMachineState().getClass().getName());
		    
		    bread.stanBy();
		    bread.removeBread();
		    bread.enterBread();
		    
		    System.out.println("\n------------------------------------------------------");

		   
		    System.out.println("\nBaking Machine Current state is : "
		                    + bread.getBakingMachineState().getClass().getName());

		    bread.stanBy();
		    bread.enterBread();
		    bread.removeBread();
		    System.out.println("\n-------------------------------------------------------");



	}

}
