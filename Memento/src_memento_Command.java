package memento;

public interface Command {
    String getName();
    void execute();

    void setCommand(String name);
}
