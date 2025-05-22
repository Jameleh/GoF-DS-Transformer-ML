public class Main {
    public static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem();

        navigationSystem.setStrategy(new BikeRoutingStrategy());
        navigationSystem.buildRoute("Point A", "Point B");

        navigationSystem.setStrategy(new CarRoutingStrategy());
        navigationSystem.buildRoute("Point B", "Point C");

        navigationSystem.setStrategy(new PublicTransportRoutingStrategy());
        navigationSystem.buildRoute("Point C", "Point D");
    }
}