package com.ljp.colleagues;

/**
 * Represents a Fan with basic operations to turn it on or off.
 * <p>
 * This class provides methods to control the state of the fan and
 * check if it is currently on. It maintains an internal state to
 * track whether the fan is on or off.
 */
public class Fan implements Appliance {
    private boolean isOn = false;

    /**
     * Turns the fan on by setting its internal state to true and
     * prints a message indicating the fan is now on.
     */
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan is ON");
    }

    /**
     * Turns the fan off by setting its internal state to false and
     * prints a message indicating the fan is now off.
     */
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is OFF");
    }

    /**
     * Checks if the fan is currently on.
     *
     * @return true if the fan is on, false otherwise.
     */
    @Override
    public boolean isOn() {
        return isOn;
    }
}
