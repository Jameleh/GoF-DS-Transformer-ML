package mainpack;

public class Memento {

	// The article stored in memento Object
	
		private String kuisioner;

		// Save a new article String to the memento Object
		
		public Memento(String kuisionerSave) { kuisioner = kuisionerSave; }
		
		// Return the value stored in article 
		
		public String getSavedKuisioner() { return kuisioner; }

}
