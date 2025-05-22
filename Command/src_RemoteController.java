import java.util.Dictionary;
import java.util.Hashtable;

// Invoker
public class RemoteController {
    private Dictionary<String, ICommand> commands = new Hashtable<String, ICommand>();

    public void addCommand(String key, ICommand command) {
        this.commands.put(key, command);
    }

    public void execute(String key) {
        this.commands.get(key).execute();
    }
}
