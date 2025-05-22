package org.code.factories;

import org.code.ClothesFactory;
import org.code.products.Shirt;
import org.code.products.Shoe;
import org.code.products.Trousers;
import org.code.products.shirt.GalaShirt;
import org.code.products.shoe.GalaShoe;
import org.code.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new GalaTrousers();
    }
}
