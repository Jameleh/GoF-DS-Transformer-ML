/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

/**
 * Square is a concrete class that implements the Shape interface
 * @author Emma Frimpong
 * @version 1.0
 */
public class Square implements Shape {
    
/**
 * The draw() method of the Square class returns the String "Square::draw()"
 * @return String
 * @author EmmaFrimpong
 * @version 1.0
 */
   @Override
   public String draw() {
      System.out.println("Square::draw()");
      return "Square::draw()";
   }
}
