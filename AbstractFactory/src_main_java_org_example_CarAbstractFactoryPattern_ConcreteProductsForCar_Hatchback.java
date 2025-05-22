package org.example.CarAbstractFactoryPattern.ConcreteProductsForCar;

import org.example.CarAbstractFactoryPattern.Car;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car");
    }
}
