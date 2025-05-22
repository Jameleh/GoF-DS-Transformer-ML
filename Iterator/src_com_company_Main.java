package com.company;

public class Main {

    public static void main(String[] args) {

        vegetablesStock vegetablesStock = new vegetablesStock();

        for (Iterator iterate = vegetablesStock.getIterator(); iterate.hasNext();){
            String item = (String)iterate.next();
            System.out.println(item);
        }

    }
}
