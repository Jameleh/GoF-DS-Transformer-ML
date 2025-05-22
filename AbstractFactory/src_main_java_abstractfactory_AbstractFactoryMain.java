package abstractfactory;

import abstractfactory.example.factories.PizzaFactory;
import abstractfactory.example.pizza.Pizza;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Pizza margharita = PizzaFactory.createPizza("Margharita", 32);
        Pizza capriciosa = PizzaFactory.createPizza("Capriciosa", 42);
        //Pizza fruttiDiMare = PizzaFactory.createPizza("Frutti di Mare", 32);
        System.out.println(margharita);
        System.out.println(capriciosa);
        //System.out.println(fruttiDiMare);
    }
}
