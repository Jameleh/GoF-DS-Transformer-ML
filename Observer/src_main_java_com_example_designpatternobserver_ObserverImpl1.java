package com.example.designpatternobserver;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("*******ObserverImpl1*********");
        System.out.println("Mise a jour du state :"+state);
        System.out.println("Résultat de calcul :"+((state%2)==0?"Pair":"impaire"));
        System.out.println("***************************");



    }
}
