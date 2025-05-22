package visitor.example;

import visitor.exercise.Animal;

public class ShoppingCartImpl implements ShoppingCart {

    @Override
    public int visit(Car car) {
        int cost;
        //apply 1000$ discount if car color is white
        if (car.getColor().equals("white")) {
            cost = car.getPrice() - 1000;
        } else {
            cost = car.getPrice();
        }
        System.out.println("Car: " + car.getBrand() + ", color: " + car.getColor() + ", cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Computer computer) {
        int cost = computer.getPrice();
        System.out.println("Computer: RAM = " + computer.getRam() + ", HDD = " + computer.getHdd() + ", CPU = " + computer.getCpu() + ", cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Animal animal){
        int cost;
        switch (animal.getType()) {
            case "Dog":
                cost = animal.getPrice() - 20;
                break;
            case "Cat":
                cost = animal.getPrice() - 5;
                break;
            default:
                cost = animal.getPrice();
                break;
        }
        System.out.println("Animal: Type = " + animal.getType() + ", cost = " + cost);
        return cost;
    }

}