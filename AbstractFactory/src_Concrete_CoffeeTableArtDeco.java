package Concrete;

import Factory.Furniture;

public class CoffeeTableArtDeco implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is CoffeeTable ArtDeco");
    }
}
