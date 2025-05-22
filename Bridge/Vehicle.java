/**
Implementor vehicle class
 */
public abstract class Vehicle {
    //Composition - implementor
    protected Colour color;

    //constructor with implementor as input argument
    public Vehicle(Colour c){
        this.color=c;
    }

    abstract public void applyColour();

}
