/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

/**
 * ShapeMaker is a concrete class which represents Facade Design Pattern
 * @author Emma Frimpong
 * version 1.0
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   /**
    * The ShapeMaker Constructor creates objects of the Circle, Rectangle, Shape and Square 
    * @author Emma Frimpong
    * version 1.0
    */
   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   /**
    * The drawCircle() returns the draw() method from the Circle() object
    * @return String data
    * @author Emma Frimpong
    * @version 1.0
    */
   public String drawCircle(){
      return circle.draw();
   }
   
   
   /**
    * The drawRectangle() returns the draw() method from the Rectangle() object
    * return String 
    * @author Emma Frimpong
    * @version 1.0
    */
   public String drawRectangle(){
      return rectangle.draw();
   }
   
      /**
    * The drawSquare() returns the draw() method from the Square() object
    * return String 
    * @author Emma Frimpong
    * @version 1.0
    */
   public String drawSquare(){
      return square.draw();
   }
}
