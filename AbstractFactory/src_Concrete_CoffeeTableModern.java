package Concrete;

import Factory.Furniture;

public class CoffeeTableModern implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is CoffeeTable Modern");
    }
}
