package Abstraction;

import Implementation.Pizza;

public class ItelianRestaurent extends Restaurent {

    public ItelianRestaurent(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        pizza.setToppings("-");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thin");
    }

}
