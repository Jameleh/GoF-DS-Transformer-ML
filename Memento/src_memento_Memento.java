package memento;

public class Memento {
    private String backup;
    private ApplicationEditor editor;

    public Memento(ApplicationEditor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
