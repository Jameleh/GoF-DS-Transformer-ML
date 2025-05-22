package com.ljp.mediators;

import com.ljp.colleagues.Button;
import com.ljp.colleagues.Fan;


/**
 * The {@code FanMediator} class implements the {@link Mediator} interface to coordinate
 * interactions between a {@link Button} and a {@link Fan}. It manages the state of the fan
 * based on button presses, toggling the fan on or off.
 */
public class FanMediator implements Mediator {
    private Button button;
    private Fan fan;

    /**
     * Constructs a {@code FanMediator} with the specified {@link Button} and {@link Fan}.
     * Initializes the mediator by setting itself as the mediator for the button.
     *
     * @param button the button to be associated with this mediator
     * @param fan    the fan to be controlled by this mediator
     */
    public FanMediator(Button button, Fan fan) {
        this.button = button;
        this.fan = fan;
        this.button.setMediator(this);
    }

    /**
     * Toggles the state of the fan based on its current state.
     * If the fan is on, it turns it off; otherwise, it turns it on.
     */
    public void press() {
        if (fan.isOn()) fan.turnOff();
        else fan.turnOn();
    }
}
