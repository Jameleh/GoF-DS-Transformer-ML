package com.prototypedesignpattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		VehicleRegistry vr=new VehicleRegistry();//base class objects get instantiated here
		
		Car car1 =(Car) vr.getVehicle(VehicleType.CAR);//getting the car details which has been instantiated at the above line
		System.out.println(car1);
		
		Car car2=(Car) car1.clone();//cloning the car1 (Shallow coping)
		 System.out.println(car2);
		 
		car2.setNoOfWheels(10);//changing the property value;
		car2.setEngineCapacity("500 CC");
		
		System.out.println(car2);
		
		//as the fields are primitive and string types shallow copy=deep copy
		System.out.println(car1);
		
		Bus b1=(Bus) vr.getVehicle(VehicleType.BUS);
		System.out.println(b1);
		
	}
}
