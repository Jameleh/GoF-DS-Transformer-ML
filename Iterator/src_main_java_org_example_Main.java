package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConcreteList<String> iterator = new ConcreteList<>();
        iterator.add("Item 1");
        iterator.add("Item 2");
        iterator.add("Item 3");
        iterator.add("Item 4");

        Iterator<String> it = iterator.createIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}