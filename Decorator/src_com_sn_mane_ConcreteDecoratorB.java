package com.sn.mane;

/**
 *
 * ConcreteDecoratorB, add features to component
 *
 */
public class ConcreteDecoratorB extends Decorator {

    private boolean behaviorMethodInvoked = false;

    @Override
    public void operation() {
        this.component.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        behaviorMethodInvoked = true;
    }

    protected boolean isBehaviorMethodInvoked() {
        return behaviorMethodInvoked;
    }
}
