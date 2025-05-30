package ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory{
    String directoryName;
    List<Object>objectList;

    public Directory(String name){
        this.directoryName=name;
        objectList=new ArrayList<>();
    }
    public void add(Object object){
        objectList.add(object);
    }
    public void ls(){
        System.out.println("Directory Name: " + directoryName);
        for(Object object : objectList){
            if(object instanceof File){
                ((File) object).ls();
            }
            else if(object instanceof Directory){
                ((Directory) object).ls();
            }
        }
    }
}