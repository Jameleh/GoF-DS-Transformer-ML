public class CommandIncreaseHeatingValue implements ICommand {
    private HeatManager manager = null;

    public CommandIncreaseHeatingValue(HeatManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute() {
        this.manager.increaseTemperature();
    }
}
