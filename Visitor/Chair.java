public class Chair implements Furniture {
    @Override
    public double accept(ShippingCostCalculator calculator) {
        return calculator.calculateShippingCost(this);
    }
}