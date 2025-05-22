package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.ArrayList;
import java.util.List;

/**
 * Class imitate Pastry chef stuff of the restaurant.
 * Stuff that work only with specific items from order.
 * Take order list and delete item from list if it can work
 * with it then change response.
 * New chain take updated order list.
 */

public class PastryChef extends Stuff {

    public PastryChef() {

        // List of specific items with what it works.
        List<String> pastrychefList = new ArrayList<>();

        pastrychefList.add("Apricot Danish");
        pastrychefList.add("Profiteroles");
        pastrychefList.add("Florentine tarts");

        // Set items list.
        setCookiesList(pastrychefList);
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

                System.out.println("Pastry-chef will bake " + item);

                orderItems.remove(i);
                order.setOrderItems(orderItems);
            }
        }

        // Change of response.
        super.handle(order);
    }
}
