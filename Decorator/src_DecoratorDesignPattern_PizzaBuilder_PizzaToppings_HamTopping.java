package DecoratorDesignPattern.PizzaBuilder.PizzaToppings;

import DecoratorDesignPattern.PizzaBuilder.Pizza;

public class HamTopping extends PizzaToppingsDecorator{

        private Pizza incompletePizza;

        public HamTopping(Pizza incompletePizza) {
            super(incompletePizza);
        }

        public String getDescription() {
            return super.getDescription() + ", with ham";
        }

        public double getCost() {
            return super.getCost() + 0.5;
        }
}
