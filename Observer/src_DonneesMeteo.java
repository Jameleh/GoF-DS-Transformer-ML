import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Observable {

    private float temperature;
    private float humidite;
    private float pression;


    private final List<Observer> observers = new ArrayList<>() ;

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void deleteObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }


    public void setMesures(float temperature, float humidite, float pression)
    {
        this.temperature=temperature;
        this.humidite=humidite;
        this.pression=pression;
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }

}
