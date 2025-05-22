package DecoratorDesignPattern.PizzaBuilder.PizzaToppings;

import DecoratorDesignPattern.PizzaBuilder.Pizza;

public abstract class PizzaToppingsDecorator implements Pizza {

    private Pizza incompletePizza;

    public PizzaToppingsDecorator(Pizza incompletePizza) {
        this.incompletePizza = incompletePizza;
    }

    public String getDescription() {
        return incompletePizza.getDescription();
    }

    public double getCost() {
        return incompletePizza.getCost();
    }
}