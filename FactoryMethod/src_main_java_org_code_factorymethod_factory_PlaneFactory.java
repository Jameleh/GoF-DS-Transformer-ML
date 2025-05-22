package org.code.factorymethod.factory;

import org.code.factorymethod.Vehicle;
import org.code.factorymethod.models.Plane;

public class PlaneFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
