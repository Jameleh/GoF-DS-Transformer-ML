package com.sn.mane.strategy;


/**
 * Implements the algorithm defined in Strategy interface.
 *
 */
public class ConcreteStrategyB implements Strategy{

    @Override
    public String algorithmInterface() {
        return "Go to airport with ConcreteStrategyB, take a bus";
    }

}
