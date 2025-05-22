/**
 * Base class for Home (screen)
 * @author pattersonhowell
 *
 */
public class HomeState implements State {
	
	private GameConsole gameConsole;

	/*
	 * Display when home button is pressed
	 */
	public void pressHomeButton() {
		
		System.out.println("You are already on the home screen.");
	}
	
	/*
	 * Display when nintendo button is pressed
	 */
	public void pressNintendoButton() {
		
		System.out.println("Starting Nintendo....");
	}
	
	/*
	 * Display when xBox button is pressed
	 */
	public void pressXBoxButton() {
		
		System.out.println("Starting xBox....");
	}
	
	/*
	 * Display when games button is pressed
	 */
	public void pressGameButton() {
		
		System.out.println("You have to pick a gaming system to play.");
	}
}
