package strategy;

import strategy.example.Cash;
import strategy.example.CreditCard;
import strategy.example.Ingredient;
import strategy.example.Pizza;

public class StrategyMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        Ingredient ingredient1 = new Ingredient("Chees",15);
        Ingredient ingredient2 = new Ingredient("Ham",20);
        Ingredient ingredient3 = new Ingredient("Mushrooms",10);

        pizza.addIngredient(ingredient1);
        pizza.addIngredient(ingredient2);
        pizza.addIngredient(ingredient3);

        pizza.pay(new Cash());

        pizza.pay(new CreditCard("David Wilson", "5195552421627633", "324", "02/2025"));

        //pizza.pay(new GooglePay("sda@sdacademy.pl", "password"));
    }
}
