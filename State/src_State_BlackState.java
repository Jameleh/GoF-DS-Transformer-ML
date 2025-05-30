package State;

import java.awt.*;

public class BlackState extends State {
    // Next state for the Black state:
    // On a push(), go to "red"
    // On a pull(), go to "green"
    public void handlePush(Context c) {
        c.setState(new RedState());
    }
    public void handlePull(Context c) {
        c.setState(new GreenState());
    }
    @SuppressWarnings("exports")
    public Color getColor() {return (Color.black);}
}// end class BlackState
