package com.example.designpatternobserver;

public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(int state) {
        if(state%2==0) ++counter;
        System.out.println("*******ObserverImpl2*********");
        System.out.println("Mise a jour du state :"+state);
        System.out.println("Résultat de calcul :"+((state%2)==0?"Pair":"impaire"));
        System.out.println("Le compteur est :" +counter);
        System.out.println("***************************");



    }
}
