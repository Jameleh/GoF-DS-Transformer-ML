package visitor.exercise;

import visitor.example.Item;
import visitor.example.ShoppingCart;

public class Animal implements Item {

    private String type;
    private int price;

    public Animal(String type, int price){
        this.type = type;
        this.price = price;
    }

    public String getType(){
        return this.type;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public int accept(ShoppingCart visitor) {
        return visitor.visit(this);
    }
}
