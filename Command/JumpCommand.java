/**
 * Jump command class implementing Command class
 * @author Overachievers
 */
public class JumpCommand implements Command{
    private Robot robot;

    /**
     * Constructor for jump command setting given to local robot 
     * @param robot A Robot for the robot
     */
    public JumpCommand(Robot robot){
        this.robot = robot;
    }

    /**
     * Executes the jump command
     */
    public void execute(){
        robot.jump();
    }
}
