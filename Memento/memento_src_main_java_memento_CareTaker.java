package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

   //lista zapisanych stanów
      private List<Memento> mementoList = new ArrayList<Memento>();

//dodaje stan do listy
  public void add(Memento state){

     mementoList.add(state);

  }

 
//zwraca stan z listy
  public Memento get(int index){

     return mementoList.get(index);

  }

}
