package com.ahmetvatansever.CompositePatternGraphic;

public class Ellipse extends GraphicObject{

    public Ellipse(String name, String color) {
        super(name, color);
    }

    public void draw() {
        System.out.println("Drawing an ellips     :" + name);
    }


    public void erase() {
        System.out.println("Erasing an ellips     :" + name);
    }


    public void paint() {
        System.out.println("Painting an ellips    :" + name + " and its color is " + color);
    }
}
