package com.ljp.colleagues;

/**
 * Represents a Light with basic operations to turn it on or off.
 * <p>
 * This class provides methods to control the state of the light and
 * check if it is currently on. It maintains an internal state to
 * track whether the light is on or off.
 */
public class Light implements Appliance {
    private boolean isOn = false;

    /**
     * Turns the light on by setting its internal state to true and
     * prints a message indicating the light is now on.
     */
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }

    /**
     * Turns the light off by setting its internal state to false and
     * prints a message indicating the light is now off.
     */
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }

    /**
     * Checks if the light is currently on.
     *
     * @return true if the light is on, false otherwise.
     */
    @Override
    public boolean isOn() {
        return isOn;
    }
}