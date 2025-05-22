package dev.eroglu;

public class Water implements Visitable{
    private double price;

    public Water(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }
}
