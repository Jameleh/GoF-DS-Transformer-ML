package org.example.shapes;

import org.example.sinterface.Shape;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {

    //intrinsic property
    private final boolean fill;

    public Oval(boolean f){
        this.fill=f;
        System.out.println("Creating Oval object with fill = " + f);

        //adding time delay during object creation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics circle, int x, int y, int width, int height,
                     Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if(fill){
            circle.fillOval(x, y, width, height);
        }
    }

}
