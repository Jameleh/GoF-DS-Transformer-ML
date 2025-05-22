/**
 * Fire command class implementing Command class
 * @author Overachievers
 */
public class FireCommand implements Command{
    private Robot robot;

    /**
     * Constructor to set given robot to local robot
     * @param robot A Robot for the robot
     */
    public FireCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * Executes the fire command
     */
    public void execute(){
        robot.fire();
    }
}
