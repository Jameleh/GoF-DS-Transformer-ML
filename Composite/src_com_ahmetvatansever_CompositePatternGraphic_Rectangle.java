package com.ahmetvatansever.CompositePatternGraphic;

public class Rectangle extends GraphicObject{

    public Rectangle(String name, String color) {
        super(name, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing an Rectangle  :" + name);
    }

    @Override
    public void erase() {
        System.out.println("Erasing an Rectangle  :" + name);
    }

    @Override
    public void paint() {
        System.out.println("Painting an Rectangle :" + name + " and its color is " + color);
    }
}
