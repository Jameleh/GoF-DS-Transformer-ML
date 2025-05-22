// ConcreteStrategy
public class CarRoutingStrategy implements IRoutingStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Building car route from " + startPoint + " to " + endPoint);
    }
}
