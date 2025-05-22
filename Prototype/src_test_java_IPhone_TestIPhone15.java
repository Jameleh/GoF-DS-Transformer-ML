package IPhone;

import IPhone.IPhone15.IPhone15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIPhone15 {

    /**
     * This is a test case that verifies the cloning functionality of the IPhone15 class, ensuring that
     * the cloned object has similar values to the original object.
     */
    @Test
    public void testIphone15CloneHavingSimilarValues() {
        IPhone15 iPhone15 = new IPhone15(12345, "DEFAULT", 2, 1, 6, true);
        IPhone15 iPhone15Cloned = iPhone15.clone();
        Assertions.assertEquals(iPhone15.getSerialNumber(), iPhone15Cloned.getSerialNumber());
        Assertions.assertEquals(iPhone15.getColor(), iPhone15Cloned.getColor());
        Assertions.assertEquals(iPhone15.getRam(), iPhone15Cloned.getRam());
        Assertions.assertEquals(iPhone15.getCamera(), iPhone15Cloned.getCamera());
        Assertions.assertEquals(iPhone15.getSpace(), iPhone15Cloned.getSpace());
        Assertions.assertTrue(iPhone15.isWirelessCharging());
    }

    @Test
    public void testIphone15CloneObjectsAreDifferentLocation() {
        IPhone15 iPhone15 = new IPhone15(12345, "DEFAULT", 2, 1, 6, true);
        IPhone15 iPhone15Cloned = iPhone15.clone();
        Assertions.assertNotEquals(iPhone15, iPhone15Cloned);
    }
}
