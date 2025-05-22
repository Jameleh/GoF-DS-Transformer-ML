package abstractfactory.example.factories;


import abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory {

    public Pizza create(int size);
}

