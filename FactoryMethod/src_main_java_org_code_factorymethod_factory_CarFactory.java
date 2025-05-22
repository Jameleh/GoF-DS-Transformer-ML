package org.code.factorymethod.factory;

import org.code.factorymethod.Vehicle;
import org.code.factorymethod.models.Car;

public class CarFactory extends VehicleFactory{
    
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
