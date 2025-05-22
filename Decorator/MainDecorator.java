
public class MainDecorator {

	public static void main(String[] args) {
		
		Sandwich san = new MeetSandwitch();
		san = new BreathDecorator(san);
		san = new SpacyDecorator(san);
		san = new SpacyDecorator(san);
		san = new CheddarDecorator(san);
		san = new LettuceDecorator(san);
		
		san.display();

	}

}
