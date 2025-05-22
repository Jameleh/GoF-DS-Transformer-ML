package dev.eroglu;

public class TaxVisitor implements Visitor{


    public TaxVisitor() {
    }


    public double visit(Bread breadItem) {
        System.out.print("Bread: Price with Tax: ");
        return (breadItem.getPrice() * .08) + breadItem.getPrice();
    }


    public double visit(Meat meatItem) {
        System.out.print("Meat: Price with Tax: ");
        return (meatItem.getPrice() * .18) + meatItem.getPrice();
    }


    public double visit(Water waterItem) {
        System.out.print("Water Item: Price with Tax: ");
        return waterItem.getPrice();
    }
}
