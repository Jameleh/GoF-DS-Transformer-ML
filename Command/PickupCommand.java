/**
 * Pickup command class implementing Command class
 * @author Overachievers
 */
public class PickupCommand implements Command{
    private Robot robot;

    /**
     * Constructor for pickup command
     * @param robot A Robot for the robot 
     */
    public PickupCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * Executes the pickup command
     */
    public void execute(){
        robot.pickup();
    }
}