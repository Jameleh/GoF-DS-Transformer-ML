package dev.eroglu;

import java.text.DecimalFormat;

public class HolidayTaxVisitor implements Visitor{
    DecimalFormat df = new DecimalFormat("#.##");



    public HolidayTaxVisitor() {
    }


    public double visit(Bread breadItem) {
        System.out.print("Bread: Price with Tax: ");
        return (breadItem.getPrice() * .12) + breadItem.getPrice();
    }


    public double visit(Meat meatItem) {
        System.out.print("Meat: Price with Tax: ");
        return (meatItem.getPrice() * .22) + meatItem.getPrice();
    }


    public double visit(Water waterItem) {
        System.out.print("Water Item: Price with Tax: ");
        return (waterItem.getPrice()*.02)+waterItem.getPrice();
    }
}
