package factorymethod;

import factorymethod.example.Pizza;
import factorymethod.example.PizzaFactory;

public class FactoryMethodMain {

    public static void main(String[] args) {
        PizzaFactory factoris = new PizzaFactory();
        Pizza margharita = factoris.getPizza(1);
        Pizza capriciosa = factoris.getPizza(2);
        System.out.println(margharita.getDetectedPizza());
        System.out.println(capriciosa.getDetectedPizza());
        //Pizza fruttiDiMare = factoris.getPizza(3);
        //System.out.println(fruttiDiMare.getDetectedPizza());
    }

}
