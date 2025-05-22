package BuilderPattern.Model;

public class CarSchema {
    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    CarSchema(int id, String brand, String model, String color, int height, String engine, int nbrOfDoors){

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
        return "CarSchema(id "+id+"height "+height+"brand "+brand+"model "+model+"color "+color+"engine "+engine+"nbrOfDoors "+nbrOfDoors+" )";
    }

}
