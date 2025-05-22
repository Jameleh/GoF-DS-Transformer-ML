package org.example.CarAbstractFactoryPattern.ConcreteFactory;

import org.example.CarAbstractFactoryPattern.Car;
import org.example.CarAbstractFactoryPattern.CarFactory;
import org.example.CarAbstractFactoryPattern.CarSpecification;
import org.example.CarAbstractFactoryPattern.ConcreteProductForCarSpecification.EuropeSpecification;
import org.example.CarAbstractFactoryPattern.ConcreteProductsForCar.Hatchback;


public class EuropeanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
