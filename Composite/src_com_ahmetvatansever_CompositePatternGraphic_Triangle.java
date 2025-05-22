package com.ahmetvatansever.CompositePatternGraphic;

public class Triangle extends GraphicObject{
    public Triangle(String name, String color) {
        super(name, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing an triangle   :" + name);
    }

    @Override
    public void erase() {
        System.out.println("Erasing an triangle  :" + name);
    }

    @Override
    public void paint() {
        System.out.println("Painting an triangle  :" + name + " and its color is " + color);
    }
}
