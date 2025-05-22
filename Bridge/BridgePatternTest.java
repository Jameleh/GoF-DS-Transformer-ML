/**
 The BridgePatternTest is used to test the vehicle
 class by testing the paint is applied correct
 */
public class BridgePatternTest {
    public static void main(String[] args) {


        Vehicle car = new Car(new Blue());
        car.applyColour();
        //expected result car is painted blue
        Vehicle car1 = new Car(new Black());
        car1.applyColour();
        //expected result car is painted black
        Vehicle truck = new Truck(new Black());
        truck.applyColour();
        //expected result truck is painted black
        Vehicle truck1 = new Truck(new Blue());
        truck1.applyColour();
        //expected result truck is painted blue
    }
}
