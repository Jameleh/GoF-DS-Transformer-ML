public class CommandTurnOffHeating implements ICommand {
    private HeatManager manager = null;

    public CommandTurnOffHeating(HeatManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute() {
        this.manager.turnHeatingOff();
    }
}
