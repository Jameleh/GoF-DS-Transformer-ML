import java.util.ArrayList;
import java.util.List;
// ConcreteSubject
public class WeatherStation implements ISubject {
    private List<IObserver> observers;
    private int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void add(IObserver o) {
        observers.add(o);
    }

    public void remove(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
