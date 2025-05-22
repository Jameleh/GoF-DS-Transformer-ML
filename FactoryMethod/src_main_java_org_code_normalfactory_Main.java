package org.code.normalfactory;

import org.code.normalfactory.factory.VehicleFactory;

public class Main {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehiculo(TypeOfVehicle.CAR.name());
        Vehicle truck = vehicleFactory.createVehiculo(TypeOfVehicle.TRUCK.name());
        Vehicle motorcycle = vehicleFactory.createVehiculo(TypeOfVehicle.MOTORCYCLE.name());
        Vehicle plane = vehicleFactory.createVehiculo(TypeOfVehicle.PLANE.name());

        car.start();
        truck.start();
        motorcycle.start();
        plane.start();
    }
}