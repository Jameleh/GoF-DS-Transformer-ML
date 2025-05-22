public class CommandDecreaseHeatingValue implements ICommand {
    private HeatManager manager = null;

    public CommandDecreaseHeatingValue(HeatManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute() {
        this.manager.decreaseTemperature();
    }
}
