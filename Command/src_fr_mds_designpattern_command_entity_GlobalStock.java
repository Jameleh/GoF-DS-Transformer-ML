package fr.mds.designpattern.command.entity;


import java.util.ArrayList;
import java.util.Stack;

public class GlobalStock {
    private ArrayList<Stock> listStock;
    private Stack<GlobalStock> history;

    public void addStock(String name) {
        if (listStock.stream().anyMatch(x -> x.getName().equalsIgnoreCase(name) )) {
            System.out.println("Vous avez déjà un stock de "+ name + "dans votre globalStock");
        } else {
            Stock s = new Stock(name);
            listStock.add(s);
        }

    }

    public void bought(String stockName, int qt) {
        Stock s = ;
        s.add(qt);
    }

    public void sold(String stockName, int qt) {
        Stock s = ;
        s.remove(qt);
    }

    public void showHistory() {
        System.out.println("History");
        for (Commande commande: history) {
            System.out.println(commande);
        }
    }
}
