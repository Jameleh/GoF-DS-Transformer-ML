package com.sn.mane.flyweight;

/**
 * UnsharedConcreteFlyweight, defines objects which are not shared.
 *
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private Object state;

    public UnsharedConcreteFlyweight(Object state) {
        this.state = state;
    }

    @Override
    public void operation(Object extrinsicState) {

    }

    public Object getState() {
        return state;
    }
}
