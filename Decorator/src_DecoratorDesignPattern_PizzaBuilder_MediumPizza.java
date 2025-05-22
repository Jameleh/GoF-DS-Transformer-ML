package DecoratorDesignPattern.PizzaBuilder;

public class MediumPizza implements Pizza {
    public String getDescription() {
        return "Medium pizza";
    }

    public double getCost() {
        return 15.0;
    }
}