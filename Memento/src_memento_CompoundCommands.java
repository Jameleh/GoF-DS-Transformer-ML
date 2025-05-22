package memento;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundCommands extends ApplicationCommand {
    private List<ApplicationCommand> children = new ArrayList<>();

    public CompoundCommands(ApplicationCommand... command) {
        super();
        add(command);
    }

    public void add(ApplicationCommand component) {
        children.add(component);
    }

    public void add(ApplicationCommand... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(ApplicationCommand child) {
        children.remove(child);
    }

    public void remove(ApplicationCommand... components) {
        children.removeAll(Arrays.asList(components));
    }

    public List<ApplicationCommand> getCommands() {
        return this.children;
    }

    public void clear() {
        children.clear();
    }
}