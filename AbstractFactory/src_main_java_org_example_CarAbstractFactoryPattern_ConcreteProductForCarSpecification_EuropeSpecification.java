package org.example.CarAbstractFactoryPattern.ConcreteProductForCarSpecification;

import org.example.CarAbstractFactoryPattern.CarSpecification;

public class EuropeSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards");
    }
}
