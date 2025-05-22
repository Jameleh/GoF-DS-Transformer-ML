package com.example.designpatternobserver;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
    this.observers.add(observer);
    }

    @Override
    public void unsubsribe(Observer observer) {
        this.observers.remove(observer);
    }

    public int getState() {
        return state;
    }

    @Override
    public void NotifyObservers() {
        for (Observer O:this.observers
             ) {
            O.update(this.state);
        }
    }

    public void setState(int state) {
        this.state = state;
        this.NotifyObservers();
    }
}
