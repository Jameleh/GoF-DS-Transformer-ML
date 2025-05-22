public class DeleteFileCommand implements Command{

    private FileSystemReceiver  receiver;

    public DeleteFileCommand(FileSystemReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.deleteFile();
    }
}
