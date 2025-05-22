package org.example.CarAbstractFactoryPattern.ConcreteProductForCarSpecification;

import org.example.CarAbstractFactoryPattern.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations");
    }
}
