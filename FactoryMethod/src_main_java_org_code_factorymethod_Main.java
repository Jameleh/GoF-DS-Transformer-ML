package org.code.factorymethod;

import org.code.factorymethod.factory.CarFactory;
import org.code.factorymethod.factory.PlaneFactory;
import org.code.factorymethod.factory.TruckFactory;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new CarFactory().createVehicle();
        Vehicle truck = new TruckFactory().createVehicle();
        Vehicle plane = new PlaneFactory().createVehicle();
        Vehicle motorcycle = new PlaneFactory().createVehicle();

        car.start();
        truck.start();
        plane.start();
        motorcycle.start();
    }
}
