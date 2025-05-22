package org.example.AnimalAbstractFactoryPattern;

public class MammalCenozoicAnimalFactory implements EraAnimalFactory{
    @Override
    public LandAnimal makeLandAnimal() {
        return new LandAnimal(AnimalEra.MAMMAL_CENOZOIC, "Elephant");
    }

    @Override
    public SkyAnimal makeSkyAnimal() {
        return new SkyAnimal(AnimalEra.MAMMAL_CENOZOIC, "Bat");
    }

    Animal createAnimal(AnimalType type) {
        switch(type) {
            case LAND:
                return makeLandAnimal();
            case SKY:
                return makeSkyAnimal();
        }
        return null;
    }
}
