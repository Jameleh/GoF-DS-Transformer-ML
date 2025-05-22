package Concrete;

import Factory.Furniture;

public class SofaVictorian implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is Sofa Victorian");
    }
}
