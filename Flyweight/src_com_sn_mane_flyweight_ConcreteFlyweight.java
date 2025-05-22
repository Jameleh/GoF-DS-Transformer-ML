package com.sn.mane.flyweight;

/**
 *
 * ConcreteFlyweight,implements Flyweight, and add storage for intrisnic state.
 *
 */
public class ConcreteFlyweight implements Flyweight {

    private Object intrinsicState;

    public ConcreteFlyweight(Object intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    // Using extrinsicState as context and does NOT modify intrinsic state.
    @Override
    public void operation(Object extrinsicState) {

    }

    /**
     * @return intrinsic state
     */
    public Object getIntrinsicState() {
        return intrinsicState;
    }
}
