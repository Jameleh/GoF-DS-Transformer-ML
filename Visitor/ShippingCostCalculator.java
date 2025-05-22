public interface ShippinCostCalculator {

    public double accept(BulkyCalculator bulkyCalculator, double price, double shipDistance);
    public double accept(LightCalculator lightCalculator, double price);

}