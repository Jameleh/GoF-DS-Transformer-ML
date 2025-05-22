public class FurnitureShipping {
    public static void main(String[] args) {
        Chair chair = new Chair();
        Table table = new Table(20);
        Sofa sofa = new Sofa(50);

        ShippingCostCalculator shippingCostCalculator = new ShippingCostVisitor();

        double chairShippingCost = chair.accept(shippingCostCalculator);
        double tableShippingCost = table.accept(shippingCostCalculator);
        double sofaShippingCost = sofa.accept(shippingCostCalculator);

        System.out.println("Shipping cost for chair: ₱" + chairShippingCost);
        System.out.println("Shipping cost for table: ₱" + tableShippingCost);
        System.out.println("Shipping cost for sofa: ₱" + sofaShippingCost);
    }
}