package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConcreteList<String> concreteList = new ConcreteList();
        concreteList.add("Item 1");
        concreteList.add("Item 2");
        concreteList.add("Item 3");
        concreteList.add("Item 4");



        Iterator<String> it = concreteList.createIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}