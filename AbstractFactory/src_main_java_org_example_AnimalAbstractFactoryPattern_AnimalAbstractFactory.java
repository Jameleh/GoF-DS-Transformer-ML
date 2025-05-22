package org.example.AnimalAbstractFactoryPattern;

public class AnimalAbstractFactory {

    Animal animal;

    Animal createAnimal(AnimalType type) {
        AnimalEra era = getFromConfiguration();

        switch(era) {
            case DINOSAUR_MESOZOIC:
                animal = new DinosaurMosozoicAnimalFactory().createAnimal(type);
                break;
            case MAMMAL_CENOZOIC:
                animal = new MammalCenozoicAnimalFactory().createAnimal(type);
                break;
        }
        return animal;
    }

    AnimalEra getFromConfiguration() {
        return AnimalEra.DINOSAUR_MESOZOIC; // Default config
    }
}
