package IPhone;

import IPhone.IPhone14.IPhone14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIPhone14 {

    /**
     * This is a test case that verifies the cloning functionality of the IPhone14 class, ensuring that
     * the cloned object has similar values to the original object.
     */
    @Test
    public void testIphone14CloneHavingSimilarValues() {
        IPhone14 iPhone14 = new IPhone14(12345, "DEFAULT", 2, 1, 6);
        IPhone14 iPhone14Black = iPhone14.clone();
        Assertions.assertEquals(iPhone14.getSerialNumber(), iPhone14Black.getSerialNumber());
        Assertions.assertEquals(iPhone14.getColor(), iPhone14Black.getColor());
        Assertions.assertEquals(iPhone14.getRam(), iPhone14Black.getRam());
        Assertions.assertEquals(iPhone14.getCamera(), iPhone14Black.getCamera());
        Assertions.assertEquals(iPhone14.getSpace(), iPhone14Black.getSpace());
    }

    /**
     * This is a test case that verifies the cloning functionality of the IPhone14 class, ensuring that
     * the cloned object is a different location in memory than the original object.
     */
    @Test
    public void testIphone14CloneObjectsAreDifferentLocation() {
        IPhone14 iPhone14 = new IPhone14(12345, "DEFAULT", 2, 1, 6);
        IPhone14 iPhone14Black = iPhone14.clone();
        Assertions.assertNotEquals(iPhone14, iPhone14Black);
    }
}
