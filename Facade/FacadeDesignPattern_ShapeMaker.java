/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesignPattern;
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape addShape1;
    private Shape addShape2;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        addShape1 = new Circle(); 
        addShape2 = new Rectangle(); 
    }

    public void drawCircle(String... arguments) {
        circle.draw(arguments);
    }

    public void drawRectangle(String... arguments) {
        rectangle.draw(arguments);
    }

    public void drawSquare(String... arguments) {
        square.draw(arguments);
    }

   
    public void drawAdditionalShape1(String... arguments) {
        addShape1.draw(arguments);
    }

    public void drawAdditionalShape2(String... arguments) {
        addShape2.draw(arguments);
    }
}