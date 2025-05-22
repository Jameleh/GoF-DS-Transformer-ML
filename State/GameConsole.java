/**
 * Written by Collin Frames 11/21/20
 */

package csce247.state;

public class GameConsole {

	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	/**
	 * Set the variables for the other classes to use. Also setup the required output for when the program is starting up.
	 */
	
	public GameConsole() 
	{
		HomeState = new HomeState();
		NintendoState = new NintendoState();
		xBoxState = new XBoxState();
		setState(HomeState);
		System.out.println("Starting up the Game Console\n");
	}
	
	/**
	 * Sets the state of the program to "Home"
	 */
	
	public void pressHomeButton()
	{
		state.pressHomeButton();
		setState(HomeState);
	}
	
	/**
	 * Sets the state of the program to "Nintendo"
	 */
	
	public void pressNintendoButton()
	{
		state.pressNintendoButton();
		setState(NintendoState);
	}
	
	/**
	 * Sets the state of the program to "XBOX" 
	 */
	
	public void pressXBoxButton()
	{
		state.pressXBoxButton();
		setState(xBoxState);
	}
	
	/**
	 * this calls to the specific press button for the specific system that is called to 
	 */
	
	public void pressGameButton()
	{
		state.pressGameButton();
	}
	
	/**
	 * This is what actually sets the state of the program 
	 * @param state the type of system which the program is set on
	 */
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	/**
	 * returns the home state
	 * @return
	 */
	
	public State getHomeState()
	{
		return this.HomeState;
	}
	
	/**
	 * Returns the nintendo state 
	 * @return
	 */
	
	public State getNintendoState()
	{
		return this.NintendoState;
	}
	
	/**
	 * returns the XBOX state
	 * @return
	 */
	
	public State getXBoxState()
	{
		return this.xBoxState;
	}
}
