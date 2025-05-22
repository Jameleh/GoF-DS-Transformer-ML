package org.example.AnimalAbstractFactoryPattern;

public class SkyAnimal extends Animal{
    SkyAnimal(AnimalEra era, String name) {
        super(AnimalType.SKY, era, name);
    }

    //creating sky animal
    @Override
    void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
