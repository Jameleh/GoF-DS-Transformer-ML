package com.ahmetvatansever.CompositePatternDirectory.Solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> directory = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystem){
        directory.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directoryde : " + directoryName);
        for (FileSystem fileSystem: directory){
            fileSystem.ls();
        }
    }
}
