package Flyweight;

public class Main {
    private static final MarkerFactory factory = new MarkerFactory();
    private static int totalMarkers = 0;

    public static void addMarker(String name, int x, int y, String iconType, String color) {
        MarkerType type = factory.getMarkerType(iconType, color);
        Marker context = new Marker(x, y, name);
        type.draw(context.getX(), context.getY(),context.getMarkerType() );
        totalMarkers++;
    }
    public static void main(String[] args) {

        addMarker("Asmed", 10, 20, "hospital", "red");
        addMarker("Emirmed", 15, 25, "hospital", "red");
        addMarker("Del papa", 30, 40, "restaurant", "yellow");
        addMarker("Shafran", 35, 45, "restaurant", "yellow");
        addMarker("Sinoil", 50, 60, "gas", "blue");


        System.out.println("Total markers: " + totalMarkers);
        System.out.println("Unique style: " + MarkerFactory.getQuantityOfMarker());

    }
}

