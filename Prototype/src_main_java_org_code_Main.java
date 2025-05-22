package org.code;

import org.code.prototype.PriceList;
import org.code.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de precios iniciales
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(new Product("PC", 600000),
                new Product("Mause", 120000),
                new Product("Teclado", 80000),
                new Product("Pnatalla", 1350000),
                new Product("Auriculares", 40000));

        priceList.setProductList(productList);

        System.out.println(priceList);

        // Segunda lista de precios con descuento
        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList2.setName("Lista Prefer");

        for(Product product : priceList2.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2);
    }
}