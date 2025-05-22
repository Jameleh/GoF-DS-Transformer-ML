import java.io.File;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class GroceryStore{
	public static void main(String[] args){

		GroceryProductFactory bananaFactory;	//initialize concrete product factories
		GroceryProductFactory appleFactory;
		ArrayList<GroceryProduct>inventory=new ArrayList<>();	//array to store grocery products
		
		try{

			File file=new File("../products.txt");
		
			Scanner sc=new Scanner(file);
			
			while(sc.hasNextLine()){
				String[] product=sc.nextLine().split(" ");

				if(product[0].equals("Banana")){
					bananaFactory=new BananaFactory(Double.parseDouble(product[1]));
					GroceryProduct banana=bananaFactory.createProduct();
					inventory.add(banana);
					System.out.println("Banana created with price $"+banana.getPrice());
					
				}
				if(product[0].equals("Apple")){
					appleFactory=new AppleFactory(Double.parseDouble(product[1]));
					GroceryProduct apple=appleFactory.createProduct();
					System.out.println("Apple created with price $"+apple.getPrice());
					inventory.add(apple);
	
				}
			}

		}
		catch(Exception e){


		}
		


	}







}