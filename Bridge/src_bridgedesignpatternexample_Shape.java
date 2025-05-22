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
public abstract class Shape {
    //Composition - implementor
    protected Color color;
	
    //constructor with implementor as input argument
    public Shape(Color c){
	this.color=c;
    }
	
    abstract public void applyColor();
}
