package Proiect;

//Abstract class decorator

public abstract class SufragerieDecorator implements Sufragerie 
{
	//The component decoratedSufragerie should be accessible to the child decorator classes so the variable must be protected
	protected Sufragerie decoratedSufragerie;
	
	//Constructor 
	public SufragerieDecorator(Sufragerie decoratedSufragerie)
	{
		// This refers to current object itself
		this.decoratedSufragerie = decoratedSufragerie;
	}
	
	//Redefining method from class Sufragerie
	public int pret()
	{
		return decoratedSufragerie.pret(); //Returns the final price 
	}
	
	//Method to get the price of every component
	public int getCost()
	{
		return 0;
	}
}
