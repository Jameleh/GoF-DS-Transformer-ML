package org.example.AnimalAbstractFactoryPattern;

public interface EraAnimalFactory {

    //methods for creating animals per era
    //concrete factory classes will implement this interface to create the animals
    LandAnimal makeLandAnimal();
    SkyAnimal makeSkyAnimal();
}
