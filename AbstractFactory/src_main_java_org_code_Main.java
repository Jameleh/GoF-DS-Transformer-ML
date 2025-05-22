package org.code;

import org.code.factories.GalaClothesFactory;
import org.code.factories.SportClothesFactory;
import org.code.products.Shirt;
import org.code.products.shirt.GalaShirt;
import org.code.products.shirt.SportShirt;
import org.code.products.shoe.GalaShoe;
import org.code.products.shoe.SportShoe;
import org.code.products.trousers.GalaTrousers;
import org.code.products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {

        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();

        System.out.println("\n---> Ejemplo de ropa deportiva <--- ");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();

        // Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();

        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();

        System.out.println("\n---> Ejemplo de ropa de gala <--- ");
        galaShirt.hasButtons();
        galaShoe.isRunningShoes();
        galaTrousers.getClosureType();
    }
}