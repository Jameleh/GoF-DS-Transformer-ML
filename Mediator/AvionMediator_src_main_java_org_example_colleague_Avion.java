package org.example.colleague;

import org.example.mediator.TourDeControle;

public class Avion {
    private String nom;
    private TourDeControle tourDeControle;

    public Avion(String nom, TourDeControle tourDeControle) {
        this.nom = nom;
        this.tourDeControle = tourDeControle;
        tourDeControle.enregistrerAvion(this);
    }

    public String getNom() {
        return nom;
    }

    public void envoyerMessage(String message) {
        System.out.println(nom + " envoie un message : " + message);
        tourDeControle.envoyerMessage(message, this);
    }

    public void recevoirMessage(String message, Avion expediteur) {
        System.out.println(nom + " reçoit un message de " + expediteur.getNom() + " : " + message);
    }
}
