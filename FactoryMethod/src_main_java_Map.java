public abstract class Map {

    protected int width;
    protected int height;
    protected Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
    }

    public abstract Tile createTile();

    public void display() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = createTile();
                System.out.print(tiles[x][y].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
