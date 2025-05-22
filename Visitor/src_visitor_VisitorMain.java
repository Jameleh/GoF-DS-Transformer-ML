package visitor;

import visitor.example.*;

import java.util.ArrayList;

public class VisitorMain {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Car("Ford Mondeo", "black", 14000));
        items.add(new Car("Opel Corsa", "white", 19000));
        items.add(new Computer("8 GB", "1 TB", "3,8 GHz 2 core", 2000));
        items.add(new Computer("16 GB", "1 TB SSD", "4,5 GHz 8 core", 5000));
        int total = 0;
        ShoppingCart visitor = new ShoppingCartImpl();
        for(Item item : items){
            total += item.accept(visitor);
        }
        System.out.println("Total Cost = " + total);

//        items = new ArrayList<>();
//        items.add(new Animal("Dog", 140));
//        items.add(new Animal("Cat", 58));
//        visitor = new ShoppingCartImpl();
//        total = 0;
//        for(Item item : items){
//            total += item.accept(visitor);
//        }
//        System.out.println("Total Cost = " + total);
    }
}
