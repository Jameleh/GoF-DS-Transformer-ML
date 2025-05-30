package com.ahmetvatansever.CompositePatternGraphic;

import java.util.ArrayList;
import java.util.Collection;

public class Canvas extends GraphicObject implements CompositeGraphic {
    protected Collection<Graphic> elements;

    public Canvas(String name, String color) {
        super(name, color);
        elements = new ArrayList<>();
    }

    public void draw() {
      System.out.println("\nDrawing canvas        :" + name);
      for (Graphic graphic: elements){
          graphic.draw();
      }
    }

    public void erase() {
        System.out.println("\nErasing canvas       :" + name);
        for (Graphic graphic: elements){
            graphic.erase();
        }
    }

    public void paint() {
        System.out.println("\nPainting canvas       :" + name + " amd its color is " + color);
        for (Graphic graphic: elements){
            graphic.paint();
        }
    }

    @Override
    public void addGraphic(Graphic graphic) {
        elements.add(graphic);
    }

    @Override
    public void removeGraphic(Graphic graphic) {
        elements.remove(graphic);
    }

    @Override
    public Collection<Graphic> getGraphics() {
        return elements;
    }

    @Override
    public void listGraphic() {
        System.out.println("\n----------------- Graphic Objects -----------------");
        for (Graphic graphic : elements){
            System.out.println((Graphic) graphic);
        }
    }
}
