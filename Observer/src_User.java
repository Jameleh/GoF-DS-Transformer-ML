// ConcreteObserver
public class User implements IObserver {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature updated to: " + temperature);
    }

    public int getTemperature() {
        return this.temperature;
    }
}