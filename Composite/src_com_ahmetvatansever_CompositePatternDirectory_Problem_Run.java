package com.ahmetvatansever.CompositePatternDirectory.Problem;

public class Run {
    public static void main(String[] args) {
        Directory onceDirectory= new Directory("One");
        File border= new File("Border");
        onceDirectory.add(border);

        Directory secondDirectory=new Directory("Second");
        File hulchul=new File("Hulchul");
        secondDirectory.add(hulchul);
        onceDirectory.add(secondDirectory);

        onceDirectory.ls();
    }
}
