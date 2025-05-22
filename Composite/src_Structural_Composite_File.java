package Structural.Composite;

import java.awt.*;

public class File implements FileSystemComponent {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("File : " + name + ", Size: " + size + " bytes");
    }

 @Override
    public long getSize() {
        return size;
    }
}
