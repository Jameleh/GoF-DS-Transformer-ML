import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ShoppingMallProducts {

    static LinkedHashMap<String, Product> productMap;
    static{
        productMap = new LinkedHashMap<String , Product>();
        Book wearebackBook = new Book ("We ara back","ISBN-1111",1000);
        Book jesusStoryBook = new Book ("Jesus Story Book","ISBN-1112",1100);
        Book moralStoryBook = new Book ("moral Story Book","ISBN-1113",1500);

        Shoes Sneakers = new Shoes("Sneakers", 4000);
        Shoes NursingShoes = new Shoes("Nursing Shoes",3750);
        Shoes WorkBoots = new Shoes("WorkBoots",6500);

        Shirt EMANUELBERG = new Shirt(" EMANUEL BERG","42", 1500);
        Shirt Brioni = new Shirt(" Brioni ","15", 2500);
        Shirt Everlane = new Shirt(" Everlane","24", 3500);

        productMap.put("wearebackBook", wearebackBook);
        productMap.put("jesusStoryBook ",jesusStoryBook);
        productMap.put("moralStoryBook",moralStoryBook);
        productMap.put("Sneakers",Sneakers);
        productMap.put("NursingShoes",NursingShoes);
        productMap.put("WorkBoots",WorkBoots);
        productMap.put("EMANUELBERG",EMANUELBERG);
        productMap.put("Brioni",Brioni);
        productMap.put("Everlane",Everlane);

    }

    public  int getTotalAmout( ArrayList<Product> purchasedProductList){
        Cashier cashier = new Cashier(" Perera ");
        System.out.println("Purchased Products Details : \n ");
        for (Product product : purchasedProductList){
            //Each product addepts the visitor
            if (product != null) {
            product.accept(cashier);

            System.out.println(product+ "\n");
            }
            else{
                {
                    // Handle the case where product is null (optional based on your logic)
                    System.out.println("Encountered a null product in the list.");
                }
            }
        }
        return cashier.getTotalPrice();
    }
}
