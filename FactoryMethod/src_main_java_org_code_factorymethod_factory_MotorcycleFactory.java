package org.code.factorymethod.factory;

import org.code.factorymethod.Vehicle;
import org.code.factorymethod.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
