package withStrategy;

public class SpecialDriveStrategy implements IStrategy {
    @Override
    public void drive() {
        System.out.println("Special drive capabilities");
    }
}
