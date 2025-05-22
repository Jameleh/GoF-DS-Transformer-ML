package org.example;

import org.example.composant.Composant;
import org.example.composant.File;
import org.example.composant.Folder;

public class Main {
    public static void main(String[] args) {

        Folder folder=new Folder("Design Pattern");
        Folder d1=(Folder) folder.addComponent(new Folder("Strategy"));
        Folder d2=(Folder) folder.addComponent(new Folder("Observer"));
        Folder d3=(Folder) folder.addComponent(new Folder("Composite"));
        folder.view();

    }
}