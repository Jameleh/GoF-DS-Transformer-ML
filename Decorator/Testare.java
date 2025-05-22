package Proiect;

//Main

public class Testare
{
	public static void main(String[] args) 
	{
		//Creating an object of SufrageriePredefinita 
		Sufragerie suf = new SufrageriePredefinita(); 
		
		//Adding the elements of the living room 
		suf = new Canapea(suf);
		suf = new Fotolii(suf);
		suf = new Masa(suf);
		suf = new Scaune(suf);
		suf = new Televizor(suf);
		suf = new Masuta_cafea(suf);
		suf = new Ornament(suf);
		
		//Printing a message and the value of the final price
		System.out.println("Pretul final al redecorarii este: " + suf.pret());
	}

}
