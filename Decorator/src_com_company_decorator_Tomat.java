package com.company.decorator;

import com.company.Pizza;

public class Tomat extends Toppings {
    public Tomat(Pizza pizza) {
        super();
    }

    public String PizzaIngredient() {
        return "Tomat";
    }

    public int pris() {
        return 4;
    }
}
