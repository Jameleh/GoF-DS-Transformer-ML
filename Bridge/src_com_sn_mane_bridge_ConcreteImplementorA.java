package com.sn.mane.bridge;


/**
 *
 * ConcreteImplementatorA, implements Implementor interface
 *
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public String implementation() {
        return this.getClass().getName();
    }

}
