package ma.inpt.sudcloudiot;

import java.awt.*;

public class BlueState extends State {

	public void handlePush(Context c) {
	c.setState(new GreenState());
	}
	public void handlePull(Context c) {
	c.setState(new RedState());
	}
	@SuppressWarnings("exports")
	public Color getColor() {return (Color.blue);}
}


