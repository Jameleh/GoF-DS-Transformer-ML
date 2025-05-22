package AntiState;

import java.awt.*;

public class ContextNoSP {private Color state;
    public ContextNoSP(Color color) {state = color;}
    public ContextNoSP() {this(Color.red);}
    public Color getState() {return state;}
    public void setState(Color state) {this.state = state;}
    public void push() {
        if (state == Color.red) state = Color.blue;
        else if (state == Color.green) state = Color.black;
        else if (state == Color.black) state = Color.red;
        else if (state == Color.blue) state = Color.green;
    }

    public void pull() {
        if (state == Color.red) state = Color.green;
        else if (state == Color.green) state = Color.blue;
        else if (state == Color.black) state = Color.green;
        else if (state == Color.blue) state = Color.red;
    }
}

