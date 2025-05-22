/**
 * Base class for consoles
 * @author pattersonhowell
 *
 */
public class GameConsole {

	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	/*
	 * Setting states and starting up console
	 */
	public GameConsole() {
		
		this.HomeState = new HomeState();
		this.NintendoState = new NintendoState();
		this.xBoxState = new xBoxState();
		this.state = new HomeState();
		
		System.out.println("Starting up the Game Console");
		System.out.println();
	}
	
	/*
	 * Pressing home button and updating state
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
		setState(HomeState);
	}
	
	/*
	 * Pressing nintendo button and updating state
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
		setState(NintendoState);
		
	}
	
	/* 
	 * Pressing xBox button and updating state
	 */
	public void pressXBoxButton() {
		state.pressXBoxButton();
		setState(xBoxState);
		 
	}
	
	/*
	 * Pressing game button 
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	/*
	 * Setting the state
	 * @param state: State to change to
	 */
	public void setState(State state) {
		
		this.state = state;
	}
	
	/**
	 * Getting home state
	 * @return Home state
	 */
	public State getHomeState() {
		return HomeState;
	}
	
	/**
	 * Getting nintendo state
	 * @return Nintendo state
	 */
	public State getNintendoState() {
		return NintendoState;
	}
	
	/**
	 * Getting xBox state
	 * @return xBox state
	 */
	public State getXBoxState() {
		return xBoxState;
	}
	
	
	
}
