/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpflyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JiJi
 */
public class Ovale implements Forme{
    
    private boolean remplir;

    public Ovale(boolean remplir) {
        this.remplir = remplir;
        
        System.out.println("Creer un objet Ovale avec la forme = " + remplir);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    

    @Override
    public void dessine(Graphics graphics, int x, int y, int width, int height, Color color) {
        
        graphics.setColor(color);
        graphics.drawOval(x, y, width, height);
        
        if (remplir) {
            graphics.fillOval(x, y, width, height);
        }       
    }
    
}
