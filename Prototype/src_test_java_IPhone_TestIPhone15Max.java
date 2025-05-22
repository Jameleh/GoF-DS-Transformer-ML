package IPhone;

import IPhone.IPhone15.IPhone15Max;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIPhone15Max {

    @Test
    public void testIphone15CloneHavingSimilarValues() {
        IPhone15Max iPhone15Max = new IPhone15Max(12345, "DEFAULT", 2, 1, 6, true, true);
        IPhone15Max iPhone15MaxCloned = iPhone15Max.clone();
        Assertions.assertEquals(iPhone15Max.getSerialNumber(), iPhone15MaxCloned.getSerialNumber());
        Assertions.assertEquals(iPhone15Max.getColor(), iPhone15MaxCloned.getColor());
        Assertions.assertEquals(iPhone15Max.getRam(), iPhone15MaxCloned.getRam());
        Assertions.assertEquals(iPhone15Max.getCamera(), iPhone15MaxCloned.getCamera());
        Assertions.assertEquals(iPhone15Max.getSpace(), iPhone15MaxCloned.getSpace());
        Assertions.assertTrue(iPhone15Max.isWirelessCharging());
        Assertions.assertTrue(iPhone15Max.isSupport4k());
    }

    /**
     * This is a test case that verifies the cloning functionality of the IPhone15 Max class, ensuring that
     * the cloned object is a different location in memory than the original object.
     */
    @Test
    public void testIphone15CloneObjectsAreDifferentLocation() {
        IPhone15Max iPhone15Max = new IPhone15Max(12345, "DEFAULT", 2, 1, 6, true, true);
        IPhone15Max iPhone15MaxCloned = iPhone15Max.clone();
        Assertions.assertNotEquals(iPhone15Max, iPhone15MaxCloned);
    }
}
