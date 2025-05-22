public class RoadLogistics implements Logistics {

    @Override
    public void plan() {
        System.out.println("Plan road.");
    }

    @Override
    public Transport createTransport() {
        return new Truck("Xe tai 1",50);
    }
}
