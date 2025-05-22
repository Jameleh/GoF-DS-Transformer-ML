package com.ljp.mediators;

import com.ljp.colleagues.Appliance;
import com.ljp.colleagues.SmartButton;
import com.ljp.colleagues.Fan;

import java.util.List;


/**
 * The {@code SmartMediator} class implements the {@link Mediator} interface to coordinate
 * interactions between a {@link SmartButton} and multiple {@link Appliance} instances.
 * It manages the state of each appliance based on button presses, toggling them on or off.
 */
public class SmartMediator implements Mediator {


    private List<Appliance> appliances;

    /**
     * Constructs a {@code SmartMediator} with a list of appliances to manage.
     *
     * @param appliances the list of appliances to be managed by this mediator
     */
    public SmartMediator(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    /**
     * Toggles the state of each appliance in the list.
     * If an appliance is on, it turns it off; otherwise, it turns it on.
     */
    @Override
    public void press() {

        // Notify all appliances
        for (Appliance appliance : appliances) {
            //check all appliances status and toggle
            if (appliance.isOn()) {
                appliance.turnOff();
            } else {
                appliance.turnOn();
            }
        }
    }
}
