package Concrete;

import Factory.Furniture;

public class ChairVictorian implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is Chair Victorian");
    }
}
