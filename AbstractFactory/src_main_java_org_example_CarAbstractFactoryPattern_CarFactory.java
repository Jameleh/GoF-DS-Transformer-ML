package org.example.CarAbstractFactoryPattern;

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
