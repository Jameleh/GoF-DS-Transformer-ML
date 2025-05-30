import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    /**
     * Problem statement : https://gitlab.com/shrayansh8/interviewcodingpractise/-/tree/main/src/LowLevelDesign/DesignPatterns/CompositeDesignPattern
     */
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }
    @Override
    public void ls() {
        System.out.println("Directory name: " + directoryName);

        for(FileSystem fileSystemObj : fileSystemList){
            fileSystemObj.ls();
        }
    }
}
