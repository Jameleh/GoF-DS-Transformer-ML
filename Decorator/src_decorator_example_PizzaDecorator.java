package decorator.example;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void printIngredients() {
        this.pizza.printIngredients();
    }

    @Override
    public void addIngredients(String ingredient) {
        this.pizza.addIngredients(ingredient);
    }
}