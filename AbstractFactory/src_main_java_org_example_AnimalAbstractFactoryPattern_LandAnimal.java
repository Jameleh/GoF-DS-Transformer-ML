package org.example.AnimalAbstractFactoryPattern;

public class LandAnimal extends Animal{
    LandAnimal(AnimalEra era, String name) {
        super(AnimalType.LAND, era, name);
        create();
    }

    //creating land animal
    @Override
    void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
