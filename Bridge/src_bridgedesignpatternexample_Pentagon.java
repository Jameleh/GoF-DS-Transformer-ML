/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgedesignpatternexample;

/**
 *
 * @author marianamtzcelis
 * Example retrieved from: https://www.journaldev.com/1491/bridge-design-pattern-java
 */
public class Pentagon extends Shape{

    public Pentagon(Color c) {
	super(c);
    }

    @Override
    public void applyColor() {
	System.out.print("Pentagon filled with color ");
        color.applyColor();
    } 

}
