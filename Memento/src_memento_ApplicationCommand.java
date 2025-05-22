package memento;

import java.util.List;

public class ApplicationCommand implements Command{
    private ApplicationEditor editor;
    private String command;

    public ApplicationCommand(ApplicationEditor editor, String command) {
        this.editor = editor;
        this.command = command;
    }

    public ApplicationCommand() {
    }

    @Override
    public String getName() {
        return "Command: " + command;
    }

    @Override
    public void execute() {
        for (ApplicationCommand child : (List<ApplicationCommand>) editor.getCommands()) {
            child.setCommand(child.getName());
        }
    }

    @Override
    public void setCommand(String command) {
        this.command = command;
    }

    public void reload() {
        this.editor.reload();
    }
}
