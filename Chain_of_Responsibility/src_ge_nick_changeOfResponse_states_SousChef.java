package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.ArrayList;
import java.util.List;

/**
 * Class imitate Sous chef stuff of the restaurant.
 * Stuff that work only with specific items from order.
 * Take order list and delete item from list if it can work
 * with it then change response.
 * New chain take updated order list.
 */

public class SousChef extends Stuff {

    public SousChef() {

        // List of specific items with what it works.
        List<String> SouschefList = new ArrayList<>();

        SouschefList.add("Soy Sauce");
        SouschefList.add("Taco Sauce");
        SouschefList.add("Tartar Sauce");

        // Set items list.
        setCookiesList(SouschefList);
    }

    @Override
    public void setCookiesList(List<String> cookiesList) {
        super.setCookiesList(cookiesList);
    }

    @Override
    public void handle(Order order) {

        final List<String> orderItems = order.getOrderItems();
        final List<String> chefItems = super.getCookiesList();

        // Delete item from order if it is from chef s list.

        for(int i = 0; i < orderItems.size(); i++){

            final String item = orderItems.get(i);

            // Find item to compare.
            if(chefItems.contains(item)){

                System.out.println("Sous-chef will make " + item);

                orderItems.remove(i);
                order.setOrderItems(orderItems);
            }
        }

        // Change of response.
        super.handle(order);
    }
}
