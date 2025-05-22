package org.code.prototype;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements Iprototype {

    private String name;
    private List<Product> productList = new ArrayList<Product>();

    public PriceList(String name) {
        this.name = name;
    }

    @Override
    public Iprototype clone() {
        PriceList clone = new PriceList(name);
        clone.setProductList(productList);
        return clone;
    }

    @Override
    public Iprototype deepClone() {
        PriceList clone = new PriceList(name);
        List<Product> cloneProducts = new ArrayList<>();

        for (Product p : productList) {
            Product cloneProduct = (Product) p.clone();
            cloneProducts.add(cloneProduct);
        }
        clone.setProductList(cloneProducts);
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " - PriceList{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }
}
