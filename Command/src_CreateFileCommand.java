public class CreateFileCommand implements Command{

    private FileSystemReceiver receiver;

    public CreateFileCommand(FileSystemReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.createFile();
    }
}
