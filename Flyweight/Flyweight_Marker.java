package Flyweight;

import java.awt.*;

public class Marker {
    private int x;
    private int y;
    private String markerType;

    public Marker(int x, int y, String markerType) {
        this.x = x;
        this.y = y;
        this.markerType = markerType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getMarkerType() {
        return markerType;
    }
}
