package org.example.composant;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant{
    private List<Composant> composantList=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }



    public Composant addComponent(Composant composant){
        composant.level=this.level+1;
        composantList.add(composant);
        return composant;
    }
    @Override
    public void view() {
        System.out.println(tab()+"Folder: "+name);
        for (Composant c :composantList){
          c.view();
        }

    }
}
