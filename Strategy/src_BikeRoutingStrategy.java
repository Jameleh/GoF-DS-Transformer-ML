// // ConcreteStrategy
public class BikeRoutingStrategy implements IRoutingStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Building bike route from " + startPoint + " to " + endPoint);
    }
}
