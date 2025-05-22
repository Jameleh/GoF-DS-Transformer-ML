package Structural.Decorator;

import Structural.Decorator.component.Pizza;
import Structural.Decorator.component.PlainPizza;
import Structural.Decorator.decorator.contrete_decorator.CheeseDecorator;
import Structural.Decorator.decorator.contrete_decorator.PepperoniDecorator;

public class Client {
    public static void main(String[] args) {
        // Create a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese to the pizza using a decorator
        Pizza pizzaWithCheese = new CheeseDecorator(pizza);
        System.out.println(pizzaWithCheese.getDescription() + " Cost: $" + pizzaWithCheese.getCost());

        // Add pepperoni to the pizza using a decorator
        Pizza pizzaWithCheeseAndPepperoni = new PepperoniDecorator(pizzaWithCheese);
        System.out.println(pizzaWithCheeseAndPepperoni.getDescription() + " Cost: $" + pizzaWithCheeseAndPepperoni.getCost());
    }
}
