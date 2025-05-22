package commandDP;

public class Button {
    private String label;
    public int size;
    private Command command;

    public Button(Command command) {
        this.command=command;
    }

    public void click(){

        command.execute();

        /*
        *
        * *
        * *
        * */
    }

}
