
package facadedesignpattern;

/**
 * Facade Design Pattern to get shape objects
 * @author EmmaFrimpong
 * version 1.0
 */
public class FacadeDesignPattern {
    public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
}
