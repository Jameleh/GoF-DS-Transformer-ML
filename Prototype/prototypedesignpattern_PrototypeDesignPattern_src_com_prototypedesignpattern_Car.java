package com.prototypedesignpattern;

public class Car extends Vehicle {
	
	private int noOfWheels;

	//we can have other properties too
	
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
