package mainpack;

import java.util.ArrayList;

public class Caretaker {

	// Where all mementos are saved
	
		ArrayList<Memento> savedKuisioner = new ArrayList<Memento>();

		// Adds memento to the ArrayList
		
		public void addMemento(Memento m) { savedKuisioner.add(m); }
	   
		// Gets the memento requested from the ArrayList
		
		public Memento getMemento(int index) { return savedKuisioner.get(index); }

}
