package csce247.assignments.state;
/**
 * Hulu state class
 * @author miller
 */
public class HuluState implements State{
	TV tv;
	@Override
	public void pressHomeButton() {
		tv.setState(tv.getHomeState());
		tv.state.pressHomeButton();
	}

	@Override
	public void pressNetflixButton() {
		tv.setState(tv.getNetflixState());
		System.out.println("Loading Netflix...");
	}

	@Override
	public void pressHuluButton() {
		System.out.println("TV is already on Hulu");
	}

	@Override
	public void pressMovieButton() {
		System.out.println("Hulu Movies:");
		System.out.println("- Cars");
		System.out.println("- Cinderella");
		System.out.println("- Wall-E");
		System.out.println("- ET");
		
	}

	@Override
	public void pressTVButton() {
		System.out.println("Hulu TV Shows:");
		System.out.println("- Sesame Street");
		System.out.println("- Care Bears");
		System.out.println("- Looney Tunes");
	}
}
