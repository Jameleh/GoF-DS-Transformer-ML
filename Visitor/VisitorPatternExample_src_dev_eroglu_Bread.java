package dev.eroglu;

public class Bread implements Visitable{
    private double price;

    public Bread(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
