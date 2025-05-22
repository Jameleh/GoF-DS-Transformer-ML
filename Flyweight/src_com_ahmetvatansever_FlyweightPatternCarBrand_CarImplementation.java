package com.ahmetvatansever.FlyweightPatternCarBrand;

public class CarImplementation implements Vehicle{
    private final String vehicleType;
    private String vehicleBrand;

    public CarImplementation(){
        this.vehicleType = "Car";
    }

    @Override
    public void assignVehicleBrand(String brand) {
        this.vehicleBrand = brand;
        System.out.println("Brand:" + brand);
    }

    @Override
    public void build() {
        //System.out.println(vehicleType + " Brand :" + vehicleBrand);
        System.out.println("Car Brand :" + vehicleBrand);
    }
}
