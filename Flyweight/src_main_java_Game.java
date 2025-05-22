import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int TILE_SIZE = 32;
    private static Map map;

    public static void main(String[] args) {
        map = createMap("city", 10, 10);
        map.display();
        launch(args);
    }

    public static Map createMap(String type, int width, int height) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap(width, height);
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap(width, height);
        }
        throw new IllegalArgumentException("Unknown map type: " + type);
    }

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(map.width * TILE_SIZE, map.height * TILE_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        renderMap(gc);

        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root);
        primaryStage.setTitle("RPG Map Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void renderMap(GraphicsContext gc) {
        Tile[][] tiles = map.getTiles();
        for (int y = 0; y < map.height; y++) {
            for (int x = 0; x < map.width; x++) {
                Tile tile = tiles[y][x];
                gc.drawImage(TileGraphicFactory.getTileImage(tile.getType()), x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }
}
