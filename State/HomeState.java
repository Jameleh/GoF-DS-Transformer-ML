/**
 * Written by Collin Frames 11/21/20
 */

package csce247.state;

public class HomeState implements State {

	/**
	 * The home button method displays the required text when the user is already "home" 
	 */
	
	public void pressHomeButton()
	{
		System.out.println("You are already on the home screen.");
	}
	
	/**
	 * Displays the required text for the user when on "Nintendo"
	 */
	
	public void pressNintendoButton()
	{
		System.out.println("Starting Nintendo...");
	}
	
	/**
	 * Displays the required text for when the user hasnt chosen a system
	 */
	
	public void pressGameButton()
	{
		System.out.println("You have to pick a game system to play.");
	}

	/**
	 * Displays the required text for when the user chooses XBOX
	 */
	
	public void pressXBoxButton() 
	{
		System.out.println("Starting xBox...");	
	}
	
}
