package Structural.Decorator.decorator;
import Structural.Decorator.component.Pizza;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    public abstract String getDescription();

    public abstract double getCost();
}
