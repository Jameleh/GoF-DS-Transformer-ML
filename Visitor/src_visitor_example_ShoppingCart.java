package visitor.example;

import visitor.exercise.Animal;

public interface ShoppingCart {

    int visit(Car car);

    int visit(Computer computer);

    int visit(Animal animal);
}