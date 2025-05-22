package com.prototypedesignpattern;

public abstract class Vehicle implements Cloneable{
	
	private String fuelType;
	private String engineCapacity;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public Vehicle clone()throws CloneNotSupportedException{
		return (Vehicle) super.clone();
	}
	
	// we can add other methods too
	
	@Override        //shallow copy 
	public String toString() {
		return "Vehicle [fuelType=" + fuelType + ", engineCapacity=" + engineCapacity + "]";
	}

}
