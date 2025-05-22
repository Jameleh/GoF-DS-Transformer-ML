package Concrete;

import Factory.Furniture;

public class SofaArtDeco implements Furniture {
    @Override
    public void Type() {
        System.out.println("Furniture type is Sofa ArtDeco");
    }
}
