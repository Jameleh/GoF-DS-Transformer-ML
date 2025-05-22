package Flyweight;

import java.awt.*;

public class MarkerType {
    private String iconType;
    private String color;


    public MarkerType(String iconType, String color) {
        this.iconType = iconType;
        this.color = color;
    }

    public String getIconType() {
        return iconType;
    }

    public String getColor() {
        return color;
    }

    public void draw(int x, int y, String name) {
        System.out.println("Render marker - " + name + " on (" + x + ", " + y + ")" +
                " with  " + iconType + ", color " + color);
    }
}
