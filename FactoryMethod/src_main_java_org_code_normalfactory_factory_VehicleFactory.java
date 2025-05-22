package org.code.normalfactory.factory;

import org.code.normalfactory.Vehicle;
import org.code.normalfactory.models.Car;
import org.code.normalfactory.models.Motorcycle;
import org.code.normalfactory.models.Plane;
import org.code.normalfactory.models.Truck;

public class VehicleFactory {

    public Vehicle createVehiculo(String typeOfVehicle){

        if(typeOfVehicle.equalsIgnoreCase("Car")){
            return new Car();
        }

        if(typeOfVehicle.equalsIgnoreCase("Truck")){
            return new Truck();
        }

        if(typeOfVehicle.equalsIgnoreCase("Motorcycle")){
            return new Motorcycle();
        }

        if (typeOfVehicle.equalsIgnoreCase("Plane")){
            return new Plane();
        }

        return null;
    }
}
