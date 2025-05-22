public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command command = new Command(editor);

        // Initial state
        editor.setText("Initial text");
        editor.setCursor(0, 0);
        editor.setSelectionWidth(10);
        System.out.println("Initial State:");
        printEditorState(editor);

        // Make a backup before making changes
        command.makeBackup();

        // Change the state
        editor.setText("Changed text");
        editor.setCursor(5, 5);
        editor.setSelectionWidth(20);
        System.out.println("State After Changes:");
        printEditorState(editor);

        // Undo the changes
        command.undo();
        System.out.println("State After Undo:");
        printEditorState(editor);
    }

    private static void printEditorState(Editor editor) {
        System.out.println("Text: " + editor.getText());
        System.out.println("Cursor: (" + editor.getCurX() + ", " + editor.getCurY() + ")");
        System.out.println("Selection Width: " + editor.getSelectionWidth());
    }
}