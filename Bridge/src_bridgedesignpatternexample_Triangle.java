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
public class Triangle extends Shape{

    public Triangle(Color c) {
	super(c);
    }

    @Override
    public void applyColor() {
	System.out.print("Triangle filled with color ");
	color.applyColor();
    } 

}
