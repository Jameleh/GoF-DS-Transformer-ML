/**
 * Base class for nintendo
 * @author pattersonhowell
 *
 */
public class NintendoState implements State {
	
	private GameConsole gameConsole;
	
	private String[] games = new String[] {"MarioKart", "WiiSports", "MonsterJam", "GuitarHero", "Jeopardy"};
	
	/*
	 * Display when home button is pressed
	 */
	public void pressHomeButton() {
		
		System.out.println("Display Home Screen...");
	}
	
	/*
	 * Display when nintendo button is pressed
	 */
	public void pressNintendoButton() {
		
		System.out.println("You are already viewing Nintendo");
	}
	
	/*
	 * Display when xBox button is pressed
	 */
	public void pressXBoxButton() {
		
		System.out.println("Starting xBox....");
	}
	
	/*
	 * Display when game button is pressed
	 */
	public void pressGameButton() {
		System.out.println("You have the following games:");
		
		for(int i = 0; i < games.length; i++) {
			System.out.println(games[i]);
		}
		System.out.println();
	}

}
