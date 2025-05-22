
package ma.inpt.sudcloudiot;

import java.awt.*;

public class RedState extends State {
	public void handlePush(Context c) {
	c.setState(new BlueState());
	}
	public void handlePull(Context c) {
	c.setState(new BlackState());
	}
	@SuppressWarnings("exports")
	public Color getColor() {return (Color.red);}
}

