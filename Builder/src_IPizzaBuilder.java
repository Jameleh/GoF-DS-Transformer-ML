// Builder
public interface IPizzaBuilder {
    public Pizza.PizzaBuilder estPateEpaisse(boolean valeur);
    public Pizza.PizzaBuilder garnitures(String garniture);
    public Pizza build();
}
