public class CommandTurnOnHeating implements ICommand {
    private HeatManager manager = null;

    public CommandTurnOnHeating(HeatManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute() {
        this.manager.turnHeatingOn();
    }
}
