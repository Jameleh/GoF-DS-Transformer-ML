package com.example.designpatternobserver;

public class Test {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Observer o1= new ObserverImpl1();
        Observer o2= new ObserverImpl2();
        observable.subscribe(o2);
        observable.subscribe(o1);
        observable.setState(55);
        observable.setState(59);
        //il va plus recevoir de notification
        observable.unsubsribe(o1);
        observable.setState(12);

    }
}
