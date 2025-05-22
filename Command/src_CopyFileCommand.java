public class CopyFileCommand implements Command{

    private FileSystemReceiver receiver;

    public CopyFileCommand(FileSystemReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.copyFile();
    }
}
