package ma.inpt.sudcloudiot;

import java.awt.*;

public class BlackState extends State {
	public void handlePush(Context c) {
	c.setState(new RedState());
	}
	public void handlePull(Context c) {
	c.setState(new GreenState());
	}
	@SuppressWarnings("exports")
	public Color getColor() {return (Color.black);}
}

