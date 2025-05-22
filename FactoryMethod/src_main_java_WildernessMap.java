import java.util.Random;

public class WildernessMap extends Map {
    private Random random = new Random();

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new ForestTile();
        }
    }
}
