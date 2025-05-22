package LabFDP;

public class Valet implements HotelService {
    private String plateNumber;
    
    @Override
    public void execute() {
        System.out.println("Picking up the vehicle with plate number " + plateNumber +
                          "\nThe vehicle successfully parked.\n");
    }

    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
