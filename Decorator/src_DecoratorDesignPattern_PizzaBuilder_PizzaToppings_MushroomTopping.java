package DecoratorDesignPattern.PizzaBuilder.PizzaToppings;

import DecoratorDesignPattern.PizzaBuilder.Pizza;

public class MushroomTopping extends PizzaToppingsDecorator {

    private Pizza incompletePizza;

    public MushroomTopping(Pizza incompletePizza) {
        super(incompletePizza);
    }

    public String getDescription() {
        return super.getDescription() + ", with mushrooms";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }
}
