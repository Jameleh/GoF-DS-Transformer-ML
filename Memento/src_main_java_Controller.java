import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Deque;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history

    private final Deque<IMemento> undo = new ArrayDeque<>();
    private final Deque<IMemento> redo = new ArrayDeque<>();
    private final List<IMemento>  all  = new ArrayList<>();

    public Controller(Gui gui) {
        this.gui = gui;
        this.model = new Model();
        save();
    }


    public void setOption(int n, int choice) {
        model.setOption(n, choice);
        commit();
    }
    public void setIsSelected(boolean b) {
        model.setIsSelected(b);
        commit();
    }

    public void undo() {
        if (undo.size() <= 1) return;
        redo.push(undo.pop());
        restore(undo.peek());
    }

    public void redo() {
        if (redo.isEmpty()) return;
        undo.push(redo.pop());
        restore(undo.peek());
    }

    public void jumpTo(IMemento m) {
        if (m == null) return;
        undo.push(model.createMemento());
        redo.clear();
        restore(m);
    }

    public List<IMemento> getHistory() { return all; }

    private void commit() {
        save();
        redo.clear();
    }

    private void save() {
        IMemento snap = model.createMemento();
        undo.push(snap);
        all.add(snap);
    }

    private void restore(IMemento m) {
        model.restoreState(m);
        gui.updateGui();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }
}