package mainpack;

public class Originator {

	private String kuisioner;

	// Sets the value for the article
	
	public void set(String newKuisioner) { 
		System.out.println("From Originator: Current Version of kuisioner\n"+newKuisioner+ "\n");
	    this.kuisioner = newKuisioner; 
	}

	// Creates a new Memento with a new article
	
	public Memento storeInMemento() { 
	    System.out.println("From Originator: Saving to Memento");
	    return new Memento(kuisioner); 
	}
	   
	// Gets the article currently stored in memento
	
	public String restoreFromMemento(Memento memento) {
		   
		kuisioner = memento.getSavedKuisioner(); 
	       
		System.out.println("From Originator: Previous Article Saved in Memento\n"+kuisioner + "\n");
		
		return kuisioner;
	   
	}

}
