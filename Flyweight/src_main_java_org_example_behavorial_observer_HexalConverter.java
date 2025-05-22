package org.example.behavorial.observer;

import org.example.creational.factory.abstractFactory.ui.elements.Input;

public class HexalConverter extends Observer{
    public HexalConverter(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("Değişen yeni değerin Hexal değeri : " + Integer.toHexString(number));
    }
}
