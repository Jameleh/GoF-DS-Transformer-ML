package abstractfactory.example.factories;

import abstractfactory.example.pizza.Margharita;
import abstractfactory.example.pizza.Pizza;

public class MargharitaFactory implements PizzaAbstractFactory {

    public Pizza create(int size) {
        return new Margharita(size);
    }
}
