public class SeaLogistics implements Logistics{

    @Override
    public void plan() {
        System.out.println("Sea plan");

    }

    @Override
    public Transport createTransport() {
        return new Ship("Titanic1",100000,7.5);
    }
}
