package processes;

public class LaptopManufacturing extends ManufactoringProcess {

    private String deviceName;

    public LaptopManufacturing(String name) {
        super(name);
        this.deviceName = name;
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled Laptop: " + deviceName);
    }

    @Override
    protected void testingDevice() {
        System.out.println("Tested Laptop: " + deviceName);
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged Laptop: " + deviceName);
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored Laptop: " + deviceName);
    }
}
