/**
 * @Author: Nika Robaqidze
 * @Email: nika42568@gmail.com

 * Scenario:
 * Restaurant have 5 stuff. At the first we initialize all of them.
 * Then set sequence of them work.
 * Sequence:
 * - Waiter first take list of order from client;
 * - Waiter get order to cook chef and stuff edit list;
 * - Then order take sous chef, it also modifies list;
 * - Last cooker is pastry chef, it modifies list in last time.
 * - After all kitchen manager check order list if it contains not allowed item
 * it notifies client about it. When waiter take order again it mean that order end.
 */

package ge.nick;

import ge.nick.changeOfResponse.states.*;
import ge.nick.changeOfResponse.utils.Handler;
import ge.nick.changeOfResponse.utils.Order;

import java.util.ArrayList;
import java.util.List;

public class CORLauncher {
    public static void main(String[] args) {

        // Initialize restaurant each stuff.

        Handler waiter = new Waiter();

        Handler cooksChef = new CookChef();
        Handler sousChef = new SousChef();
        Handler pastryChef = new PastryChef();

        Handler kitchenManager = new KitchenManager();

        // Initialize sequence of order.

        waiter.setNext(cooksChef);
        cooksChef.setNext(sousChef);
        sousChef.setNext(pastryChef);
        pastryChef.setNext(kitchenManager);
        kitchenManager.setNext(waiter);

        // Client initialize order list. Add items to order.

        List<String> orderItems = new ArrayList<>();
        orderItems.add("Chocolate Chip Cookies");
        orderItems.add("Taco Sauce");
        orderItems.add("Florentine tarts");
        //orderItems.add("Xinkali");

        // Waiter take order. Order begin.
        Order order = new Order(orderItems);
        waiter.handle(order);
    }
}
