/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgedesignpatternexample;

/**
 *
 * @author marianamtzcelis
 * Example retrieved from: https://www.journaldev.com/1491/bridge-design-pattern-java
 */
public class BridgeDesignPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
		
        Shape pent = new Pentagon(new GreenColor());
	pent.applyColor();
    }
    
}
