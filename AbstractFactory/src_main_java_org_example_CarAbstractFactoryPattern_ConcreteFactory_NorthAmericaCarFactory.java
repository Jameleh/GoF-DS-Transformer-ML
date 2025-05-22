package org.example.CarAbstractFactoryPattern.ConcreteFactory;

import org.example.CarAbstractFactoryPattern.Car;
import org.example.CarAbstractFactoryPattern.CarFactory;
import org.example.CarAbstractFactoryPattern.CarSpecification;
import org.example.CarAbstractFactoryPattern.ConcreteProductForCarSpecification.NorthAmericaSpecification;
import org.example.CarAbstractFactoryPattern.ConcreteProductsForCar.Sedan;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
