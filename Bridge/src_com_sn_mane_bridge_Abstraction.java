package com.sn.mane.bridge;

/**
 *
 * Abstraction, defines abstraction interface, maintains a reference to object
 * of type Implementator
 *
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    abstract String operation();

}
