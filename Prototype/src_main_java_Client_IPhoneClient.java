package Client;

import IPhone.IPhone14.IPhone14;
import IPhone.IPhone14.IPhone14Max;
import IPhone.IPhone15.IPhone15;
import IPhone.IPhone15.IPhone15Max;
import IPhone.IPhoneModels;
import IPhoneRegistry.IPhonePrototypeRegistry;

public class IPhoneClient {

    public static String COLOR = "BLACK";

    /**
     * Return the iPhone 14 object with a black color and a unique serial number..
     */
    public IPhone14 getBlackIPhone14() {
        IPhonePrototypeRegistry registry = IPhonePrototypeRegistry.getInstance();
        IPhone14 iPhone14 = (IPhone14) registry.getPrototypeByModelName(IPhoneModels.IPHONE_14);
        iPhone14.setSerialNumber(299);
        iPhone14.setColor(COLOR);
        return iPhone14;
    }

    /**
     * Return the iPhone 14 Max object with a black color and a unique serial number..
     */
    public IPhone14Max getBlackIPhone14Max() {
        IPhonePrototypeRegistry registry = IPhonePrototypeRegistry.getInstance();
        IPhone14Max iPhone14Max = (IPhone14Max) registry.getPrototypeByModelName(IPhoneModels.IPHONE_14_MAX);
        iPhone14Max.setSerialNumber(399);
        iPhone14Max.setColor(COLOR);
        return iPhone14Max;
    }

    /**
     * Return the iPhone 15 object with a black color and a unique serial number..
     */
    public IPhone15 getBlackIPhone15() {
        IPhonePrototypeRegistry registry = IPhonePrototypeRegistry.getInstance();
        IPhone15 iPhone15 = (IPhone15) registry.getPrototypeByModelName(IPhoneModels.IPHONE_15);
        iPhone15.setSerialNumber(499);
        iPhone15.setColor(COLOR);
        return iPhone15;
    }

    /**
     * Return the iPhone 15 Max object with a black color and a unique serial number..
     */
    public IPhone15Max getBlackIPhone15Max() {
        IPhonePrototypeRegistry registry = IPhonePrototypeRegistry.getInstance();
        IPhone15Max iPhone15Max = (IPhone15Max) registry.getPrototypeByModelName(IPhoneModels.IPHONE_15_MAX);
        iPhone15Max.setSerialNumber(599);
        iPhone15Max.setColor(COLOR);
        return iPhone15Max;
    }
}
