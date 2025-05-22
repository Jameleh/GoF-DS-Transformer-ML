import Abstraction.Restaurent;
import Implementation.PepperoniPizza;
import Implementation.VeggiePizza;
import Abstraction.AmericanRestaurent;
import Abstraction.ItelianRestaurent;

public class MainApp {
    public static void main(String[] args) {
        Restaurent americanRestaurant = new AmericanRestaurent(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurent italianRestaurant = new ItelianRestaurent(new VeggiePizza());
        italianRestaurant.deliver();
    }
}