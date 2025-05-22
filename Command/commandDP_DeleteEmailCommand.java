package commandDP;

public class DeleteEmailCommand implements Command{
    private DeleteEmailManeger deleteEmailManeger= new DeleteEmailManeger();

    @Override
    public void execute() {
        deleteEmailManeger.deleteMail();
    }
}