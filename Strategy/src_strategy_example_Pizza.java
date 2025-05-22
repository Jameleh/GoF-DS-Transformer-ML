package strategy.example;

import java.util.ArrayList;

public class Pizza {

    private ArrayList<Ingredient> ingredients;
    private int amount;

    public Pizza() {
        this.amount = 20;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    public int calculateTotal() {
        int sum = 0;
        sum = ingredients.stream().map((ingredient) -> ingredient.getPrice()).reduce(sum, Integer::sum);
        return sum;
    }

    public void pay(Payment payment) {
        payment.pay(amount + calculateTotal());
    }
}