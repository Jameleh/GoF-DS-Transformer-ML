package com.example.designpatternobserver;

public interface Observable {
    public void subscribe(Observer observer);// pour ajouter un observateur
    public void unsubsribe(Observer observer); // pour supprimer un observateur
    public void NotifyObservers(); // pour notifier les observateur
}
