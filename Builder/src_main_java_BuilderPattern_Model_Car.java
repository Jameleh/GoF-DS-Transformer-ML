package BuilderPattern.Model;

public class Car {
    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    Car(int id, String brand, String color, String engine, int nbrOfDoors, String model,int height){

        this.id = id;
        this.height = height;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }

    @Override
    public String toString(){
       /* return """
    Car {
    id=%s,
    height=%s,
    brand=%s,
    model=%s,
    color=%s,
    engine=%s,
    nbrOfDoors=%s
    }""".formatted(id,height,brand,model,color,engine,nbrOfDoors);*/
        return "Car(id "+id+"height "+height+"brand "+brand+"model "+model+"color "+color+"engine "+engine+"nbrOfDoors "+nbrOfDoors+" )";
    }

}
