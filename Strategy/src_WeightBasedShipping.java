public class WeightBasedShipping implements ShippingCostStrategy{

    @Override
    public double calculate(double weight){
        return weight * 5;
    }
}
