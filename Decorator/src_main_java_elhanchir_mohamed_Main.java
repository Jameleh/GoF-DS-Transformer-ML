package elhanchir.mohamed;

import elhanchir.mohamed.decorator.ConcreteDecoratorA;
import elhanchir.mohamed.decorator.ConcreteDecoratorB;

public class Main {
    public static void main(String[] args) {
        Component test=new ConcreteDecoratorA(new ConcreteDecoratorA(new ConcreteDecoratorB(new ComponentImpl1())));
        test.operation();
    }
}