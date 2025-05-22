public class ShippingCostVisitor implements ShippingCostCalculator{
    @Override
    public double calculateShippingCost(Chair chair) {
        return 150;
    }

    @Override
    public double calculateShippingCost(Table table) {
        return table.getWeight() * 10;
    }

    @Override
    public double calculateShippingCost(Sofa sofa) {
        return sofa.getDistance() * 5;
    }
}