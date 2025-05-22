package csce247.assignments.state;
/**
 * Netflix state class
 * @author miller
 */
public class NetflixState implements State{
	TV tv;
	@Override
	public void pressHomeButton() {
		tv.setState(tv.getHomeState());
		System.out.println("Loading Home Screen...");
	}

	@Override
	public void pressNetflixButton() {
		System.out.println("TV is already on Netflix");
	}

	@Override
	public void pressHuluButton() {
		tv.setState(tv.getHuluState());
		System.out.println("Loading Hulu...");
	}

	@Override
	public void pressMovieButton() {
		System.out.println("Netflix Movies:");
		System.out.println("- The Land Before Time");
		System.out.println("- Frozen");
		System.out.println("- The Little Mermaid");
		System.out.println("- Ice Age");
	}

	@Override
	public void pressTVButton() {
		System.out.println("Netflix TV Shows:");
		System.out.println("- Peppa Pig");
		System.out.println("- My Little Pony");
		System.out.println("- Garfield");
		System.out.println("- Teenage Mutant Ninja Turtles");
	}
}
