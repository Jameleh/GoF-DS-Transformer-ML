package com.ahmetvatansever.FlyweightPatternCarBrand;

public class ShipImplementation implements Vehicle{
    private final String vehicleType;
    private String vehicleBrand;

    public ShipImplementation(){
        this.vehicleType = "Ship";
    }

    @Override
    public void assignVehicleBrand(String brand) {
        this.vehicleBrand = brand;
        System.out.println("Brand:" + brand);
    }

    @Override
    public void build() {
        System.out.println(vehicleType + " Brand:" + vehicleBrand);
    }
}
