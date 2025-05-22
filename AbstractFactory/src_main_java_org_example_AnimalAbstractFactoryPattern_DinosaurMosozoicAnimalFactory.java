package org.example.AnimalAbstractFactoryPattern;

public class DinosaurMosozoicAnimalFactory implements EraAnimalFactory{
    @Override
    public LandAnimal makeLandAnimal() {
        return new LandAnimal(AnimalEra.DINOSAUR_MESOZOIC, "TRex");
    }

    @Override
    public SkyAnimal makeSkyAnimal() {
        return new SkyAnimal(AnimalEra.DINOSAUR_MESOZOIC, "Teradactyl");
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
