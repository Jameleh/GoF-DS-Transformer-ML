
package FacadeDesignPattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle("Red", "Border: Thick");
        shapeMaker.drawRectangle("Yellow", "Border: Thick", "Solid");
        shapeMaker.drawSquare("Orange");
        shapeMaker.drawAdditionalShape1("Black", "Border: Thick");
        shapeMaker.drawAdditionalShape2("Pink", "Border: Thick", "Solid");
    }
}