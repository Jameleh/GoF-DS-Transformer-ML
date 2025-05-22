package org.code;

import org.code.products.Shirt;
import org.code.products.Shoe;
import org.code.products.Trousers;

public interface ClothesFactory {

    Shoe createShoes();
    Shirt createShirt();
    Trousers createTrousers();
}
