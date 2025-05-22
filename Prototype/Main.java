import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shape = new ArrayList<>();
        Shape newShape = new Circle(2, 3, 4);
        shape.add(newShape.clone());
    }
}