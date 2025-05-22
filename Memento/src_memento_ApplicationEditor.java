package memento;

import java.io.*;
import java.util.Base64;

public class ApplicationEditor {
    private History history;
    private ApplicationCommand applicationCommand;
    private CompoundCommands allCommands;

    public ApplicationEditor() {
        applicationCommand = new ApplicationCommand();
        history = new History();
        allCommands = new CompoundCommands();
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        if (history.undo())
            applicationCommand.reload();
    }

    public void redo() {
        if (history.redo())
            applicationCommand.reload();
    }

    public String backup() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.allCommands);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allCommands = (CompoundCommands) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }

    public CompoundCommands getCommands() {
        return this.allCommands;
    }

    public void reload() {
        this.allCommands.clear();
    }
}
