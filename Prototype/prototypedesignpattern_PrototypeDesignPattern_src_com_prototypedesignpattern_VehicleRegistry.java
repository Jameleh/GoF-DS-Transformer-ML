package com.prototypedesignpattern;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
	
	private Map<VehicleType,Vehicle> vehicleMap=new HashMap<>();
	
	public VehicleRegistry() {
		this.intialize(); //when we create object of this class we are instantiating the car and bus classes
	}

	private void intialize() {
		
		Car c=new Car();
		c.setEngineCapacity("400 CC");
		c.setFuelType("petrol");
		c.setNoOfWheels(4);
		
		Bus b= new Bus();
		b.setEngineCapacity("150 CC");
		b.setFuelType("diesel");
		b.setNoOfWheels(8);
		
		this.vehicleMap.put(VehicleType.CAR,c);
		this.vehicleMap.put(VehicleType.BUS, b);
	}
	
	//used to fetch the required vehicle in the client class
	public Vehicle getVehicle(VehicleType vehicleType) {
		return this.vehicleMap.get(vehicleType);
	}

}
