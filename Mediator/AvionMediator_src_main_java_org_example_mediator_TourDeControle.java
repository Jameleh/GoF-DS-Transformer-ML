package org.example.mediator;

import org.example.colleague.Avion;

public interface TourDeControle {
    public void enregistrerAvion(Avion avion);
    public void envoyerMessage(String message, Avion expediteur);
}
