package org.code.normalfactory.models;

import org.code.normalfactory.Vehicle;

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
