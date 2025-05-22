package memento;

public class Memento {
    
    private String state;
      
       
//Konstruktor klasy przyjmuje aktualny stan obiektu 
    public Memento(String state){
  
       this.state = state;
  
    }

//zwraca zapisany stan obiektu 
    public String getState(){
  
       return state;
  
    }      

}
