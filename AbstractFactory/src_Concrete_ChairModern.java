package Concrete;

import Factory.Furniture;

public class ChairModern implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is Chair Modern");
    }
}
