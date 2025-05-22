/**
 * Written by Collin Frames 11/21/20
 */

package csce247.state;

public class NintendoState implements State {

	/**
	 * Array of games chosen from the required output
	 */
	
	String[] games = {"The Legends of Zelda", "Super Smash Bros", "Super Mario", 
						"Mario Kart", "Animal Crossing", "Pokemon"};
	
	/**
	 * The home button method displays the required text when the user is already "home" 
	 */
	
	public void pressHomeButton()
	{
		System.out.println("Display Home Screen.");
	}
	
	/**
	 * Displays the required text for the user when on "Nintendo" and is already on nintendo
	 */
	
	public void pressNintendoButton()
	{
		System.out.println("You are already viewing Nintendo.");
	}
	
	/**
	 * Displays the required text for when the user chooses XBOX
	 */
	
	public void pressXBoxButton()
	{
		System.out.println("Starting xBox...");
	}
	
	/**
	 * Displays the games for the nintendo system
	 */
	
	public void pressGameButton()
	{
		System.out.println("You have the following games:");
		for(String game : games)
		{
			System.out.println(game);
		}
		System.out.println("\n");
	}
}
