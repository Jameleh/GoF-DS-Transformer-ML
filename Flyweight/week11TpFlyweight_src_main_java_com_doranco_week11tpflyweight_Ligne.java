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
public class Ligne implements Forme{

    public Ligne() {
        
        System.out.println("creation de l'objet ligne");
        
        // ajouter un delais pour creer une ligne
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    

    @Override
    public void dessine(Graphics graphics, int x, int y, int width, int height, Color color) {
    
        graphics.setColor(color);
        graphics.drawLine(x, y, width, height);
    }
    
}
