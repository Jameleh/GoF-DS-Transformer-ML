package org.example.AnimalAbstractFactoryPattern;

/*
Abstract Factory pattern deals with
creating objects of related types
 */
public class AbstractFactoryRunner {

    public static void main(String[] args) {
        Animal dino1 = new AnimalAbstractFactory().createAnimal(AnimalType.LAND);
        dino1.create();

        Animal mam1 = new MammalCenozoicAnimalFactory().createAnimal(AnimalType.SKY);
        mam1.create();


    }
}
