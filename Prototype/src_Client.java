import java.util.HashMap;

public class Client {
    private HashMap<String, Shape> prototypes = new HashMap<>();

    public Client() {
        loadPrototypes();
    }

    private void loadPrototypes() {
        Circle redCircle = new Circle("red");
        Circle blueCircle = new Circle("blue");
        Square redSquare = new Square("red");
        Square blueSquare = new Square("blue");

        prototypes.put("redCircle", redCircle);
        prototypes.put("blueCircle", blueCircle);
        prototypes.put("redSquare", redSquare);
        prototypes.put("blueSquare", blueSquare);
    }

    public Shape createShape(String type) {
        Shape shape = prototypes.get(type);
        if (shape != null) {
            return shape.clone();
        }
        return null;
    }
}
