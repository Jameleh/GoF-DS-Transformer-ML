package csce247.assignments.state;
public class TV{
	State HomeState = new HomeState();
	State NetflixState = new NetflixState();
	State HuluState = new HuluState();
	State state;
	/**
	 * TV class for changing TV states
	 * @author miller
	 */
	public TV() {
		this.setState(HomeState);
	}
	
	public void pressHomeButton() {
		this.state.pressHomeButton();
	}

	public void pressNetflixButton() {
		this.state.pressNetflixButton();
	}

	public void pressHuluButton() {
		this.state.pressHuluButton();
	}

	public void pressMovieButton() {
		this.state.pressMovieButton();
	}

	public void pressTVButton() {
		this.state.pressTVButton();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getHomeState(){
		return this.HomeState;
	}
	
	public State getNetflixState() {
		return this.NetflixState;
	}
	
	public State getHuluState() {
		return this.HuluState;
	}
}