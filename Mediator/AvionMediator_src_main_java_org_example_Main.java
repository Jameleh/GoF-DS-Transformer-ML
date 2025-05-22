package org.example;

import org.example.colleague.Avion;
import org.example.mediator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TourDeControle tourDeControle = new TourDeControleImpl();


        Avion avion1 = new Avion("Vol AF123", tourDeControle);
        Avion avion2 = new Avion("Vol BA456", tourDeControle);
        Avion avion3 = new Avion("Vol LH789", tourDeControle);

        avion1.envoyerMessage("Demande d'autorisation pour atterrissage.");
        avion2.envoyerMessage("En attente de décollage.");
        avion3.envoyerMessage("En approche de la piste.");
    }
}