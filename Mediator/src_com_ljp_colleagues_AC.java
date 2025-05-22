package com.ljp.colleagues;

/**
 * Represents an AC with basic operations to turn it on or off.
 * <p>
 * This class provides methods to control the state of the AC and
 * check if it is currently on. It maintains an internal state to
 * track whether the AC is on or off.
 */
public class AC implements Appliance {
    private boolean isOn = false;

    /**
     * Turns the AC on by setting its internal state to true and
     * prints a message indicating the AC is now on.
     */
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("AC is ON");
    }

    /**
     * Turns the AC off by setting its internal state to false and
     * prints a message indicating the AC is now off.
     */
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    /**
     * Checks if the AC is currently on.
     *
     * @return true if the AC is on, false otherwise.
     */
    @Override
    public boolean isOn() {
        return isOn;
    }
}