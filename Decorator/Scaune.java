package Proiect;
import java.util.Scanner;

//Concrete class that extends the decorator class

public class Scaune extends SufragerieDecorator
{
	//Constructor and Display a message for the user so that he can make a choice
	public Scaune(Sufragerie decoratedSufragerie) 
	{
		super(decoratedSufragerie);
		System.out.println("Pentru scaune introduceti una din urmatoarele optiuni: Lemn - 360 / Plastic - 250 / Sticla - 550 / Fara - 0");
		
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
		case "Lemn":
			System.out.println("Ati ales optiunea Lemn");
			return 360;
		case "Plastic":
			System.out.println("Ati ales optiunea Plastic");
			return 250;
		case "Sticla":
			System.out.println("Ati ales optiunea Sticla");
			return 550;
		case "Fara":
			System.out.println("Ati ales optiunea Fara scaune");
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
