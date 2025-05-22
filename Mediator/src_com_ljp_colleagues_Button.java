package com.ljp.colleagues;

import com.ljp.mediators.Mediator;

/**
 * The {@code Button} class represents a UI button component that interacts with a {@link Mediator}.
 * It allows setting a mediator and simulates a button press action.
 */
public class Button {
    private Mediator mediator;

    /**
     * Sets the mediator for this button.
     *
     * @param mediator the mediator to be set
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Simulates pressing the button. It prints a message and notifies the mediator.
     */
    public void press() {
        System.out.println("Ray pressed the button.");
        mediator.press();
    }
}
