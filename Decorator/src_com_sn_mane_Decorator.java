package com.sn.mane;

/**
 *
 * Decorator, keep reference to Component object
 *
 */
public abstract class Decorator implements Component {

    protected Component component;

    public abstract void operation();

    public void setComponent(Component component) {
        this.component = component;
    }

}
