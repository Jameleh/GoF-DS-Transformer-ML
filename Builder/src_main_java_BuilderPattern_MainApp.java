package BuilderPattern;

import BuilderPattern.Model.CarBuilder;
import BuilderPattern.Model.CarSchemaBuilder;

public class MainApp {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        System.out.println(builder.build());


        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90")
                .nbrOfDoors(3);
        System.out.println(schemaBuilder.build());
    }
}
