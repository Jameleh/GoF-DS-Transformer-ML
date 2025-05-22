public class ECommercePlatform{
    public static void main(String[] args){
        Furniture chair = new Chair(10);
        Furniture table = new Table(15);
        Furniture sofa = new Sofa(30, 100);
        ShippingCostCalculator calculator = new ShippingCostCalculatorImpl();
        chair.accept(calculator);
        table.accept(calculator);
        sofa.accept(calculator);
    }
}
