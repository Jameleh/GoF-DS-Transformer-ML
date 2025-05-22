package withStrategy;

public class NormalDriveStrategy implements IStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive capabilities");
    }
}
