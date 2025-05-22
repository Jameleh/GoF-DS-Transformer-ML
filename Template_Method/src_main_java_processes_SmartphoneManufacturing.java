package processes;

public class SmartphoneManufacturing extends ManufactoringProcess {

    private String deviceName;

    public SmartphoneManufacturing(String name) {
        super(name);
        this.deviceName = name;
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled Smartphone: " + deviceName);
    }

    @Override
    protected void testingDevice() {
        System.out.println("Tested Smartphone: " + deviceName);
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged Smartphone: " + deviceName);
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored Smartphone: " + deviceName);
    }
}
