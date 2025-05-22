package org.example.mediator;

import org.example.colleague.Avion;

import java.util.*;

public class TourDeControleImpl implements TourDeControle{
    private List<Avion> avions = new ArrayList<>();

    @Override
    public void enregistrerAvion(Avion avion) {
        avions.add(avion);
        System.out.println("La tour de contrôle enregistre l'avion : " + avion.getNom());
    }

    @Override
    public void envoyerMessage(String message, Avion expediteur) {
        for (Avion avion : avions) {
            if (avion != expediteur) {
                avion.recevoirMessage(message, expediteur);
            }
        }
    }
}
