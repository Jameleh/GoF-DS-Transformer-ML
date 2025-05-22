package ge.nick.changeOfResponse.states;

import ge.nick.changeOfResponse.utils.Order;
import ge.nick.changeOfResponse.utils.Stuff;

import java.util.List;

/**
 * Class imitate Kitchen manager stuff of the restaurant.
 * Stuff that work only with specific items from order.
 * It is last chain. If it takes response with non-empty list of order
 * it mean that item is not allowed. (not exist)
 */

public class KitchenManager extends Stuff {

    @Override
    public void handle(Order order) {

        // List of items of order.
        final List<String> orderItems = order.getOrderItems();

        // Check if order not empty
        if(orderItems.size() != 0){

            System.out.println("[Kitchen manager] Nobody could make next item(s):");

            // Print all items that are not allowed.

            for (String orderItem : orderItems) {

                System.out.println(" - " + orderItem);
            }

            return;
        }

        // Change response.
        order.setReady(true);
        // Set first (default) state.
        super.handle(order);
    }
}
