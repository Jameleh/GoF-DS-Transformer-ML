
package facadedesignpattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EF
 */
public class ShapeMakerTest {
    
    public ShapeMakerTest() {
    }
    
     /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();
        assertEquals(expResult, result);
        assertEquals("Circle::draw()", instance.drawCircle());   
        
        //negative test case
        assertNotEquals("Not Circle", instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());
//        fail("The test case is a prototype.");
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
//        System.out.println("drawRectangle");
//        ShapeMaker instance = new ShapeMaker();
//        instance.drawRectangle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
//        System.out.println("drawSquare");
//        ShapeMaker instance = new ShapeMaker();
//        instance.drawSquare();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
