import java.util.HashMap;

/**
 * This class is an important factor of making sure we can execute this program. 
 * In InputHandler, we create a hashmap commands that stores a String and a Command. 
 * We put the command name in the key and the command function in the value. We then
 * use the user's input to search within our hashmap to see if their inputted command
 * is executable. 
 * @author Overachievers
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * This method sets up the commands hashmap and inserts the keys and values. 
     * We created a hashmap with String as they key and Command as the value. 
     * The strings "heal", "fire", "jump", "pickup" are inserted into the hashmap, 
     * so the user can enter the command and we can search for it within our 
     * hashmap. We then call that command class to execute.
     * @param robot is the local robot we are using to call within the command
     * class.
     */
    public InputHandler(Robot robot){
        commands = new HashMap<String, Command>();
        commands.put("heal", new HealCommand(robot));
        commands.put("fire", new FireCommand(robot));
        commands.put("jump", new JumpCommand(robot));
        commands.put("pickup", new PickupCommand(robot));
    }

    /**
     * In this method, we are checking the input the user entered. The string the 
     * user inputs is stored as data, where we take data and see if it matches any
     * of the keys in our hashmap. If we do have that command, we will then execute 
     * that command, which is included in the value of the hashmap.
     * @param data is the string for what the user inputted for a command.
     */
    public void inputEntered(String data){
        if (commands.containsKey(data)) {
            commands.get(data).execute();
        }
    }  
}
