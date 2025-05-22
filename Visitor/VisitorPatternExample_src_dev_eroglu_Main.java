package dev.eroglu;

public class Main {

    public static void main(String[] args) {

        TaxVisitor taxCalc = new TaxVisitor();
        HolidayTaxVisitor taxHolidayCalc = new HolidayTaxVisitor();

        Bread bread = new Bread(2.0);
        Meat meat = new Meat(40.0);
        Water water = new Water(1.25);

        System.out.println(bread.accept(taxCalc));
        System.out.println(meat.accept(taxCalc));
        System.out.println(water.accept(taxCalc));

        System.out.println("\nHOLIDAY PRICES\n");

        System.out.println(bread.accept(taxHolidayCalc));
        System.out.println(meat.accept(taxHolidayCalc));
        System.out.println(water.accept(taxHolidayCalc));

    }
}
