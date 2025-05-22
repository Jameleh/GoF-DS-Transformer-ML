package org.example.AnimalAbstractFactoryPattern;

public abstract class Animal {

    //abstract class defines common attributes of animals
    AnimalType type;
    AnimalEra era;
    String name;

    Animal(AnimalType type, AnimalEra era, String name) {
        this.type = type;
        this.era = era;
        this.name = name;
    }

    //abstract create method will be implemented by concrete subclasses
    abstract void create();
}
