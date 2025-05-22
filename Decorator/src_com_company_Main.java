package com.company;

import com.company.decorator.Ost;
import com.company.decorator.Skinke;
import com.company.decorator.Tomat;

public class Main {

    public static void main(String[] args) {
        IPizza[] arr = {new Ost(new Pizza()), new Skinke(new Pizza()), new Tomat(new Pizza())};
        for(IPizza a : arr){
            System.out.println(a.PizzaIngredient());
        }
    }
}