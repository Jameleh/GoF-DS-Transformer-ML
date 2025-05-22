package decorator.exercise;

import decorator.example.Pizza;
import decorator.example.PizzaDecorator;

public class SeafoodPizza extends PizzaDecorator {

    public SeafoodPizza(Pizza pizza) {
        super(pizza);
        super.addIngredients("Seafood");
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
    }
}
