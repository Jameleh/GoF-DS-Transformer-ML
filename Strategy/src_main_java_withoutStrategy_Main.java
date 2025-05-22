package withoutStrategy;

public class Main {

    public static void main(String args[]){
        System.out.println("Main Class");

        HeavyVehicle heavyVehicle = new HeavyVehicle();
        heavyVehicle.drive();

        PassengerCar passengerCar = new PassengerCar();
        passengerCar.drive();

        SportsCar sportsCar = new SportsCar();
        sportsCar.drive();
    }

}
