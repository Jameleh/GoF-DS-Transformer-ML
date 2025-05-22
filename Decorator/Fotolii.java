package Proiect;

import java.util.Scanner;

//Concrete class that extends the decorator class

public class Fotolii extends SufragerieDecorator
{
	//Constructor and Display a message for the user so that he can make a choice
	public Fotolii(Sufragerie decoratedSufragerie) 
	{
		super(decoratedSufragerie);
		System.out.println("Pentru fotolii introduceti una din urmatoarele optiuni: Simple - 500 / Cu masaj - 1000 / De piele - 800 / Fara - 0");
	}

	//Overriding the getCost method 
	@Override
	public int getCost() 
	{
		//Making a new object of the Scanner class  that it is going to read from the standard input stream of the program
		//String variable retaining the text written from the console in s
		Scanner console = new Scanner(System.in);
		String s = console.nextLine();
		
		//Switch statement that returns the price of the object based on the text written in console
		//And also contains displays of messages that say to the user what was selected
		switch(s)
		{
		case "Simple":
			System.out.println("Ati ales optiunea Simple");
			return 500;
		case "Cu masaj":
			System.out.println("Ati ales optiunea Cu masaj");
			return 1000;
		case "De piele":
			System.out.println("Ati ales optiunea De piele");
			return 800;
		case "Fara":
			System.out.println("Ati ales optiunea Fara forolii");
			return 0;
		default: return 0;
		}
	}
	
	//Overriding the price method by adding the price of this item through method getCost to the final one
	public int pret()
	{
		return decoratedSufragerie.pret() + getCost();
	}
}
