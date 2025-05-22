package com.sn.mane.strategy;

/**
 * Implements the algorithm defined in Strategy interface.
 *
 */
public class ConcreteStrategyC implements Strategy{

    @Override
    public String algorithmInterface() {
        return "Go to airport with ConcreteStrategyC, take a metro";
    }
}
