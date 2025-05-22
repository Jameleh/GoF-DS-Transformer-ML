
public class XBoxState implements State {

    private GameConsole gameConsole;

    // constructor
    public XBoxState(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    @Override
    public void pressHomeButton() {
        gameConsole.setState(gameConsole.getHomeState());
        System.out.println("Display Home Screen.");
    }

    @Override
    public void pressNintendoButton() {
        gameConsole.setState(gameConsole.getNintendoState());
        System.out.println("Starting Nintendo");
    }

    @Override
    public void pressXBoxButton() {
        gameConsole.setState(gameConsole.getXBoxState());
        System.out.println("You are already viewing XBox");
    }

    @Override
    public void pressGameButton() {
        System.out.println("You have the following games:");
        System.out.println("Forza Horizon");
        System.out.println("Ori and the Blind Forest");
        System.out.println("Red Dead Redemption");
        System.out.println("Fortnite");
        System.out.println("Gears");
        System.out.println("Cuphead");
        System.out.println("");
    }
}
