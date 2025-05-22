package elhanchir.mohamed.decorator;

import elhanchir.mohamed.Component;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("Comportement ajouté par ConcreteDecoratorA");
    }
}
