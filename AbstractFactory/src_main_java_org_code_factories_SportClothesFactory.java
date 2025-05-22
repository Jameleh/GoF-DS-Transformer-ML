package org.code.factories;

import org.code.ClothesFactory;
import org.code.products.Shirt;
import org.code.products.Shoe;
import org.code.products.Trousers;
import org.code.products.shirt.SportShirt;
import org.code.products.shoe.SportShoe;
import org.code.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new SportTrousers();
    }
}
