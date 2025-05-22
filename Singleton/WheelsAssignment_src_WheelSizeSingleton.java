
public class WheelSizeSingleton {
	
	
	private static WheelSizeSingleton uniqueInstance;
	  
	private WheelSizeSingleton() {
		
	}
  
	public static WheelSizeSingleton getInstance()
	{
		if (uniqueInstance == null) 
		{
			System.out.println("Creating a unique instance \n");
			uniqueInstance = new WheelSizeSingleton();
		}
		System.out.println("\nReturning the instance");
		return uniqueInstance;
	}
	
	public void sizeOfWheel(String vehiclename)
	{
		if(vehiclename.equals("Car"))
		{
			System.out.println("Wheel Size for "+vehiclename+" :: 16");
		}
		else if (vehiclename.equals("Jeep"))
		{
			System.out.println("Wheel Size for "+vehiclename+" :: 20");
		}
		else if(vehiclename.equals("Bike"))
		{
			System.out.println("Wheel Size for "+vehiclename+" :: 23");
		}
	}

}
