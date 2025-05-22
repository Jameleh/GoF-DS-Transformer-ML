package org.code.factorymethod.factory;

import org.code.factorymethod.Vehicle;
import org.code.factorymethod.models.Truck;

public class TruckFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
