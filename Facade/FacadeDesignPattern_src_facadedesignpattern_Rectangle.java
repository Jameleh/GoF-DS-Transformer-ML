/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

/**
 * The Rectangle class is a concrete implementing the Shape Interface
 * @author EmmaFrimpong
 * version 1.0
 */
public class Rectangle implements Shape {
/**
 * The draw() method of the Rectangle class returns the String "Rectangle::draw()"
 * @return String
 * @author EmmaFrimpong
 * @version 1.0
 */
   @Override
   public String draw() {
      System.out.println("Rectangle::draw()");
      return "Rectangle::draw()";
   }
}
