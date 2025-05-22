package memento;



public class Originator {

      private String state;

 
//Ustawienie nowego stanu
  public void setState(String state){

     this.state = state;

  }

 
//Zwrócenie stanu
  public String getState(){

     return state;

  }

 //Tworzy nowy obiekt klasy Memento, inicjując go aktualnym stanem obiektu Originator 

  public Memento saveStateToMemento(){

     return new Memento(state);

  }

 
  //Przywrócenie stanu obiektu Originator do stanu przechowywanego w obiekcie Memento.
  public void getStateFromMemento(Memento memento){

     state = memento.getState();

  }

    
}
