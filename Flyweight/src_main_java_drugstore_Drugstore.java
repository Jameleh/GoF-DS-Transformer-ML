package drugstore;

import java.util.ArrayList;
import java.util.List;

public class Drugstore {

    List<Product> products = new ArrayList<>();

    public void addProduct(String name, String manufacturerName, String manufacturerCountry){
        ManufacturerFactory manufacturerFactory = new ManufacturerFactory();
        Manufacturer manufacturer = manufacturerFactory.getManufacturer(manufacturerName, manufacturerCountry);
        Product product = new Product(name, manufacturer);
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<String> getProductStrings(){
        List<String> productStrings = new ArrayList<>();
        for(Product product : products){
            productStrings.add(product.toString());
        }
        return productStrings;
    }
}
