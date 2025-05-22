/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter1;

import java.lang.annotation.Target;

/**
 *
 * @author hp
 */
public class Adapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=10,x1=20,y=40,y1=80;
        Rectangel rectangel=new Rectangel();
        TargetShape targetShape=new Adapter(rectangel);
        targetShape.display(x, y, x1, y1);
        
        
        
        
        
    }
    
}
