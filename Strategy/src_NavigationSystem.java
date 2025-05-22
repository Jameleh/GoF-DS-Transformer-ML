// Context
public class NavigationSystem {
    private IRoutingStrategy strategy;

    public void setStrategy(IRoutingStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String startPoint, String endPoint) {
        strategy.buildRoute(startPoint, endPoint);
    }
}
