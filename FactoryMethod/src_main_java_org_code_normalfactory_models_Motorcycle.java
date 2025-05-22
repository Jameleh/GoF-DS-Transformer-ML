package org.code.normalfactory.models;

import org.code.normalfactory.Vehicle;

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
