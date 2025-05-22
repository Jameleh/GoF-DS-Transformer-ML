package com.sn.mane.bridge;

/**
 *
 * ConcreteImplementatorB, implements Implementor interface
 *
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public String implementation() {
        return  this.getClass().getName();
    }
}
