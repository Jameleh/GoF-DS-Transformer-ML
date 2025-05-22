package abstractfactory.exercise.factories;

import abstractfactory.example.factories.PizzaAbstractFactory;
import abstractfactory.example.pizza.Pizza;
import abstractfactory.exercise.pizza.FruttiDiMare;

public class FruttiDiMareFactory implements PizzaAbstractFactory {

    public Pizza create(int size) {
        return new FruttiDiMare(size);
    }
}
