// Director
public class PizzaDirector {
    public static Pizza makeMargueritaFine() {
        Pizza result = new Pizza.PizzaBuilder("Tomate", 30).garnitures("Fromage").build();
        return result;
    }

    public static Pizza makeReineEpaisse() {
        Pizza result = new Pizza.PizzaBuilder("Tomate", 30).estPateEpaisse(true).garnitures("Fromage").garnitures("Jambon").garnitures("Champignon").build();
        return result;
    }
}
