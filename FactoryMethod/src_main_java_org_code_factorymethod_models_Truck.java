package org.code.factorymethod.models;

import org.code.factorymethod.Vehicle;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Run truck!");
    }

    @Override
    public void stop() {
        System.out.println("Stop truck!");
    }
}
