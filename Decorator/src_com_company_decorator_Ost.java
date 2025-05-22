package com.company.decorator;

import com.company.Pizza;

public class Ost extends Toppings {
    public Ost(Pizza pizza) {
        super();
    }

    public String PizzaIngredient() {
        return "Ost";
    }

    public int pris() {
        return 5;
    }
}
