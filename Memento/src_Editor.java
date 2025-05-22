public class Editor {
    private String text;
    private int curX, curY;
    private int selectionWidth;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCurX() {
        return curX;
    }

    public int getCurY() {
        return curY;
    }

    public void setCursor(int x, int y) {
        this.curX = x;
        this.curY = y;
    }

    public int getSelectionWidth() {
        return selectionWidth;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    // Saves the current state inside a memento.
    public Snapshot createSnapshot() {

        // Memento is an immutable object; that's why the
        // originator passes its state to the memento's
        // constructor parameters.

        return new Snapshot(this, text, curX, curY, selectionWidth);
    }
}
