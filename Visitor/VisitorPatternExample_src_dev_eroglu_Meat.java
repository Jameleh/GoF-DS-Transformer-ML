package dev.eroglu;

public class Meat implements Visitable{
    private double price;

    public Meat(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
