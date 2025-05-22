// ConcreteStrategy
public class PublicTransportRoutingStrategy implements IRoutingStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Building public transport route from " + startPoint + " to " + endPoint);
    }
}
