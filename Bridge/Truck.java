/**
concreteImplementor truck class
 */
public class Truck extends Vehicle {

    public Truck(Colour c) {
        super(c);
    }

    @Override
    public void applyColour() {
        System.out.print("Truck is painted ");
        color.applyColour();
    }
}