package com.company.decorator;

import com.company.IPizza;

public class Toppings implements IPizza {
    @Override
    public String PizzaIngredient() {
        return "";
    }

    @Override
    public int Pris() {
        return 0;
    }
}
