// Receiver
public class Light {
    private boolean state = false;
    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    @Override
    public String toString() {
        return this.state ? "The light is on." : "The light is off.";
    }
}
