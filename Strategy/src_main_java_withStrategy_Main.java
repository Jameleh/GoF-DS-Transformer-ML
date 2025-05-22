package withStrategy;

public class Main {

    public static void main(String args[]){
        NormalDriveStrategy n= new NormalDriveStrategy();
        PassengerCar passengerCar = new PassengerCar(n);
        passengerCar.drive();

    }
}
