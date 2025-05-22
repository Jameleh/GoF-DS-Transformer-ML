package Structural.Composite;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("Document.txt", 1024); // Example sizes in bytes
        File file2 = new File("Image.jpg", 2048);
        File file3 = new File("Spreadsheet.xlsx", 3072);

        Directory directory1 = new Directory();
        directory1.addComponent(file1);
        directory1.addComponent(file3);

        Directory directory2 = new Directory();
        directory2.addComponent(file2);

        Directory rootDirectory = new Directory();
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.displayDetails();
        System.out.println("Total size of directory: " + rootDirectory.getSize() + " bytes");
    }
}
