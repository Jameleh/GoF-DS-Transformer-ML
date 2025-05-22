public class UnixFile implements FileSystemReceiver{

    @Override
    public void createFile(){
        System.out.println("Creating file...");
    }

    @Override
    public void deleteFile(){
        System.out.println("Deleting file...");
    }

    @Override
    public void copyFile(){
        System.out.println("Copying file...");
    }
}
