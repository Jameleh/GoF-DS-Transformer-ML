package com.prototypedesignpattern;

public class Bus extends Vehicle{
	
	private int noOfWheels;

	//we can add other fields too
	
	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	

	//for readability i am getting values from parent class using super 

	
	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", Engine capacity "+super.getEngineCapacity()+
				" , fuel type "+super.getFuelType()+"]";
	}
	

}
