/**
concreteImplementor car class
 */
public class Car extends Vehicle {
    public Car(Colour c) {
        super(c);
    }

    @Override
    public void applyColour() {
        System.out.print("Car is painted  ");
        color.applyColour();
    }
}
