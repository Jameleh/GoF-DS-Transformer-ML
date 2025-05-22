package elhanchir.mohamed.decorator;

import elhanchir.mohamed.Component;

public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation(); // Appel au composant de base
        System.out.println("Comportement ajouté par ConcreteDecoratorB");
    }

}
