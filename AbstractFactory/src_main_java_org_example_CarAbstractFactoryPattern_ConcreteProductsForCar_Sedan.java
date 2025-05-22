package org.example.CarAbstractFactoryPattern.ConcreteProductsForCar;

import org.example.CarAbstractFactoryPattern.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan");
    }
}
