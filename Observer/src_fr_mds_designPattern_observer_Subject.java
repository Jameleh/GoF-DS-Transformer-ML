package fr.mds.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public Subject() {
    }

    public Subject(int state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        if (observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    protected void notifyObservers(int state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers(this.state);
    }
}
