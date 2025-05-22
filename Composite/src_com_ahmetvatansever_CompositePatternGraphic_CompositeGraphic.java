package com.ahmetvatansever.CompositePatternGraphic;

import java.util.Collection;

public interface CompositeGraphic {
    public void addGraphic(Graphic graphic);
    public void removeGraphic(Graphic graphic);
    public Collection<Graphic> getGraphics();
    public void listGraphic();
}
