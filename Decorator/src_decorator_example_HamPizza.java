package decorator.example;

public class HamPizza extends PizzaDecorator {

    public HamPizza(Pizza pizza) {
        super(pizza);
        super.addIngredients("Ham");
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
    }
}