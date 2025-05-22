package Concrete;

import Factory.Furniture;

public class ChairArtDeco implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is Chair ArtDeco");
    }
}
