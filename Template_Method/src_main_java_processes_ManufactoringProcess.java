package processes;

public abstract class ManufactoringProcess {
    private String processName;
    public ManufactoringProcess(String name){
        this.processName = name;
    }

    protected abstract void assembleDevice();

    protected abstract void testingDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    // Template method Pattern.
    public void launchProcess(){
        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testingDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process name was specified");
        }
    }
}
