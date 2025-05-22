package ma.inpt.sudcloudiot;

import java.awt.*;

public class GreenState extends State {
	public void handlePush(Context c) {
	c.setState(new BlackState());
	}
	public void handlePull(Context c) {
	c.setState(new BlueState());
	}
	@SuppressWarnings("exports")
	public Color getColor() {return (Color.green);}
}

