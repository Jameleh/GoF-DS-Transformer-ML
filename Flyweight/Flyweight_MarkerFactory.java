package Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static Map<String, MarkerType> markerTypes = new HashMap<>();

    public static MarkerType getMarkerType(String name, String color) {
        String key = name + "_" + color;
        if (!markerTypes.containsKey(key)) {
            markerTypes.put(key, new MarkerType(name, color));
            System.out.println("New marker added: " + key);
        }
        return markerTypes.get(key);
}

    public static int getQuantityOfMarker() {
        return markerTypes.size();
    }
}
