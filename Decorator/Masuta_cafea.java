package Proiect;

import java.util.Scanner;

public class Masuta_cafea extends SufragerieDecorator
{
	//Constructor and Display a message for the user so that he can make a choice
	public Masuta_cafea(Sufragerie decoratedSufragerie) 
	{
		super(decoratedSufragerie);
		System.out.println("Pentru Masuta de cafea introduceti una din urmatoarele optiuni: Patrata - 300 / Rotunda - 350 / Ovala - 400 / Fara - 0");
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
		case "Patrata":
			System.out.println("Ati ales optiunea Patrata");
			return 300;
		case "Rotunda":
			System.out.println("Ati ales optiunea Rotunda");
			return 350;
		case "Ovala":
			System.out.println("Ati ales optiunea Ovala");
			return 400;
		case "Fara":
			System.out.println("Ati ales optiunea Fara masuta de cafea");
			return 0;
		default: return 0;
		}
	}
	public int pret()
	{
		return decoratedSufragerie.pret() + getCost();
	}
}
