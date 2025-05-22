public class PizzaBuilder {

    protected final String mass;
    protected boolean cheese = false;
    protected boolean sauce = false;
    protected boolean pepperoni = false;

    public PizzaBuilder(String mass){
        this.mass = mass;
    }

    public PizzaBuilder cheese(boolean cheese){
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder sauce(boolean sauce){
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder pepperoni(boolean pepperoni){
        this.pepperoni = pepperoni;
        return this;
    }

    public Pizza build(){
        return new Pizza(this);
    }


}
