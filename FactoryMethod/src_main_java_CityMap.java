import java.util.Random;

public class CityMap extends Map {
    private Random random = new Random();

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            case 2: return new BuildingTile();
            default: return new RoadTile();
        }
    }
}
