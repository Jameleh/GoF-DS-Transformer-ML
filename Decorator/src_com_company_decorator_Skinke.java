package com.company.decorator;

import com.company.Pizza;

public class Skinke extends Toppings {
    public Skinke(Pizza pizza) {
        super();
    }

    public String PizzaIngredient() {
        return "Skinke";
    }

    public int pris() {
        return 7;
    }
}
