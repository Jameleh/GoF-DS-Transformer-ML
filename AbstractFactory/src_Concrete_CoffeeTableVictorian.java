package Concrete;

import Factory.Furniture;

public class CoffeeTableVictorian implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is CoffeeTable Victorian");
    }
}
