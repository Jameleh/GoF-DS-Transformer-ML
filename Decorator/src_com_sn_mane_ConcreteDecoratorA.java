package com.sn.mane;


/**
 *
 * ConcreteDecoratorA, add features to component
 *
 */
public class ConcreteDecoratorA  extends Decorator {
    private boolean state;

    @Override
    public void operation() {
        state = true;
        this.component.operation();
    }

    public boolean isState() {
        return state;
    }
}
