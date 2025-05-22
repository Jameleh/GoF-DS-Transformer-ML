package abstractfactory.example.factories;

import abstractfactory.example.pizza.Capriciosa;
import abstractfactory.example.pizza.Pizza;

public class CapriciosaFactory implements PizzaAbstractFactory {


    public Pizza create(int size) {
        return new Capriciosa(size);
    }
}
