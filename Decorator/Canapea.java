package Proiect;

import java.util.Scanner;

//Concrete class that extends the decorator class

public class Canapea extends SufragerieDecorator
{
	//Constructor and Display a message for the user so that he can make a choice
	public Canapea(Sufragerie decoratedSufragerie) 
	{
		super(decoratedSufragerie);	
		System.out.println("Pentru canapea introduceti una din urmatoarele optiuni: Coltar - 1200 / Simpla 2 pers - 1000 / Simpla 4 pers - 1600 / Fara - 0");
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
		case "Coltar":
			System.out.println("Ati ales optiunea Cu coltar");
			return 1200;
		case "Simpla 2 pers":
			System.out.println("Ati ales optiunea Simpla - 2 pers");
			return 1000;
		case "Simpla 4 pers":
			System.out.println("Ati ales optiunea Simpla - 4 pers");
			return 1600;
		case "Fara":
			System.out.println("Ati ales optiunea Fara canapea");
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
