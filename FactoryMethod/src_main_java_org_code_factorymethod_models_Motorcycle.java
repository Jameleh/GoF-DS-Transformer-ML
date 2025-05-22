package org.code.factorymethod.models;

import org.code.factorymethod.Vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Run motorcycle!");
    }

    @Override
    public void stop() {
        System.out.println("Stop motorcycle!");
    }
}
