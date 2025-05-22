package Structural.Decorator.decorator.contrete_decorator;

import Structural.Decorator.component.Pizza;
import Structural.Decorator.decorator.PizzaDecorator;
public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 2.0;
    }
}
