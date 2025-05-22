import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class Client {
    public static void main (String[] args ){
        LinkedHashMap<String, Product> productMap = ShoppingMallProducts.productMap;
        Set<String> products = productMap. keySet();
        System.out.println("Products Available \n");
        for (String string : products){
            System.out.println(productMap.get(string));
        }
        System.out.println(" \n########################################################### \n ");

        ArrayList<Product> purchasedProductList = new ArrayList<Product>();

        purchasedProductList.add(productMap.get("wearebackBook"));
        purchasedProductList.add(productMap.get("jesusStoryBook"));

        purchasedProductList.add(productMap.get("Sneakers"));
        purchasedProductList.add(productMap.get("NursingShoes"));

        purchasedProductList.add(productMap.get("Brioni"));
        purchasedProductList.add(productMap.get("Everlane"));

        ShoppingMallProducts shoppingMallProducts = new ShoppingMallProducts();
        System.out.println("Total Amout : " + "Rs."+ shoppingMallProducts.getTotalAmout(purchasedProductList));


    }

}
