package decorator.example;

import java.util.ArrayList;

public final class BasicPizza implements Pizza {
    ArrayList<String> ingredients;

    public BasicPizza(){
        ingredients = new ArrayList<>();
        addIngredients("Pizza dough");
        addIngredients("Tomato Sauce");
        addIngredients("Chees");
    }

    @Override
    public void printIngredients() {
        System.out.println("Pizza: "+String.join(", ", ingredients));
    }

    @Override
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }
}