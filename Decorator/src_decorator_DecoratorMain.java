package decorator;

import decorator.example.BasicPizza;
import decorator.example.HamPizza;
import decorator.example.MushroomsPizza;
import decorator.example.Pizza;

public class DecoratorMain {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza.printIngredients();
        Pizza hamPizza = new HamPizza(pizza);
        pizza.printIngredients();
        Pizza mushroomsPizza = new MushroomsPizza(pizza);
        pizza.printIngredients();

//        Pizza seafoodPizza = new SeafoodPizza(new BasicPizza());
//        pizza.printIngredients();
    }

}
