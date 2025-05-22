package Concrete;

import Factory.Furniture;

public class SofaModern implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is Sofa Modern");
    }
}
