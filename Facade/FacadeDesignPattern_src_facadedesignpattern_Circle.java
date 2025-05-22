/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

/**
 * Circle is a concrete class that implements the Shape interface
 * @author Emma Frimpong
 * @version 1.0
 */
public class Circle implements Shape {
    
/**
 * The draw() method of the Circle class returns the String "Circle::draw()"
 * @return String
 * @author EmmaFrimpong
 * @version 1.0
 */
   @Override
   public String draw() {
      System.out.println("Circle::draw()");
      return "Circle::draw()";
   }
}