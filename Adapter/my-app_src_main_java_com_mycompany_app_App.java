package com.mycompany.app;

import main.java.com.mycompany.app.Duck;
import main.java.com.mycompany.app.MallordDuck;
import main.java.com.mycompany.app.Turkey;
import main.java.com.mycompany.app.TurkeyAdapter;
import main.java.com.mycompany.app.WildTurkey;

public class App
{
    public static void main( String[] args )
    {
        Duck duck = new MallordDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
