package com.ahmetvatansever.CompositePatternGraphic;

public class Circle extends GraphicObject{
    public Circle(String name, String color) {
        super(name, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing an circle     :" + name);
    }

    @Override
    public void erase() {
        System.out.println("Erasing an circle    :" + name);
    }

    @Override
    public void paint() {
        System.out.println("Painting an circle    :" + name + " and its color is " + color);
    }
}
