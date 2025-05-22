package org.example.CarAbstractFactoryPattern;

import org.example.CarAbstractFactoryPattern.ConcreteFactory.EuropeanCarFactory;
import org.example.CarAbstractFactoryPattern.ConcreteFactory.NorthAmericaCarFactory;

/*
 a way of organizing how you create groups of things
 that are related to each other.
 */
public class CarFactoryRunner {

    public static void main(String[] args) {
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        CarFactory europeFactory = new EuropeanCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
