/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpflyweight;

import com.doranco.week11tpflyweight.FormeFactory.TypeForme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author JiJi
 */
public class DessinClient extends JFrame{
    
    private final int WIDTH;
    private final int HEIGHT;
    
    private static TypeForme formes [] = {
    
        TypeForme.LINE,
        TypeForme.OVAL_FILL,
        TypeForme.OVAL_NOFILL
    };
    
    private static  final Color colors [] = {
    
        Color.RED, Color.GREEN, Color.YELLOW
    };

    public DessinClient(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        
        Container contentPane = getContentPane();
        
        JButton startButton = new JButton("Dessiner");
        
        final JPanel panel = new JPanel();
        
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton,BorderLayout.SOUTH);
        
        setSize(WIDTH,HEIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                Graphics g = panel.getGraphics();
                
                for(int i = 0; i<20; ++i){
            
                    Forme forme = FormeFactory.getForme(getRandomShape());
                    
                    forme.dessine(g, getRandomX(), getRandomY(), getRandomWIDTH(), getRandomHEIGHT(), getRandomColor());
            } 
            }
        });
        
        
    }
    
    private TypeForme getRandomShape(){
    
        return formes[(int)(Math.random() * formes.length)];
    }
    
    private int getRandomX(){   
        return (int) (Math.random() * (WIDTH));      
    }
    
        private int getRandomY(){   
        return (int) (Math.random() * (HEIGHT));      
    }
    
    private int getRandomWIDTH(){   
        return (int) (Math.random() * (WIDTH/10));      
    }
        
    private int getRandomHEIGHT(){   
        return (int) (Math.random() * (HEIGHT/10));      
    }
    
    private Color getRandomColor(){   
        return colors [(int)(Math.random() * colors.length)];     
    }
         
    public static void main(String[] args) {
        DessinClient dessinClient = new DessinClient(500, 6000);
    }
}
