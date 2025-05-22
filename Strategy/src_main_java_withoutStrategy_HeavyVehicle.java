package withoutStrategy;

public class HeavyVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Special drive capabilities");// code redundancy when compared with sports car
    }
}
