/**
 * Heal command class implementing Command class
 * @author Overachievers
 */
public class HealCommand implements Command{
    private Robot robot;

    /**
     * Constructor for heal command setting robot to local robot
     * @param robot A Robot for the robot
     */
    public HealCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * Executes the heal command 
     */
    public void execute(){
        robot.heal();
    }
}
