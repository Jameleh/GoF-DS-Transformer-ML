package org.code.normalfactory.models;

import org.code.normalfactory.Vehicle;

public class Plane implements Vehicle {

    @Override
    public void start() {
        System.out.println("Run plane!");
    }

    @Override
    public void stop() {
        System.out.println("Stop plane!");
    }

    public void fly(){
        System.out.println("Take off the plane!");
    }
}
