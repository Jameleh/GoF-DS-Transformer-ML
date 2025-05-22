package IPhoneRegistry;

import IPhone.IPhone;
import IPhone.IPhone14.IPhone14;
import IPhone.IPhone14.IPhone14Max;
import IPhone.IPhone15.IPhone15;
import IPhone.IPhone15.IPhone15Max;
import IPhone.IPhoneModels;

import java.util.HashMap;

public class IPhonePrototypeRegistry {
    private static HashMap<String, IPhone> registry = new HashMap<>();

    private static IPhonePrototypeRegistry iPhonePrototypeRegistry;

    private IPhonePrototypeRegistry() {
        init();
    }

    /**
     * This method returns the singleton instance of the IPhonePrototypeRegistry class.
     * @return The singleton instance of the IPhonePrototypeRegistry.
     */
    public static IPhonePrototypeRegistry getInstance() {
        if (iPhonePrototypeRegistry == null) {
            synchronized (IPhonePrototypeRegistry.class) {
                if (iPhonePrototypeRegistry == null) {
                    iPhonePrototypeRegistry = new IPhonePrototypeRegistry();
                }
            }
        }
        return iPhonePrototypeRegistry;
    }

    /**
     * This method initializes the registry with various iPhone models and their corresponding objects.
     */
    public void init() {
        IPhone14 iPhone14 = new IPhone14(12345, "DEFAULT", 2, 1, 6);
        IPhone14Max iPhone14Max = new IPhone14Max(12345, "DEFAULT", 2, 1, 6, true);
        IPhone15 iPhone15 = new IPhone15(12345, "DEFAULT", 2, 1, 6, true);
        IPhone15Max iPhone15Max = new IPhone15Max(12345, "DEFAULT", 2, 1, 6, true, true);
        registry.put(IPhoneModels.IPHONE_14, iPhone14);
        registry.put(IPhoneModels.IPHONE_14_MAX, iPhone14Max);
        registry.put(IPhoneModels.IPHONE_15, iPhone15);
        registry.put(IPhoneModels.IPHONE_15_MAX, iPhone15Max);
    }

    /**
     * This method retrieves the prototype of an iPhone based on the given modelName.
     *
     * @param modelName The name of the iPhone model.
     * @return The prototype object associated with the modelName from the registry.
     */
    public IPhone getPrototypeByModelName(String modelName) {
        return registry.get(modelName);
    }

    /**
     * This method adds a prototype of an iPhone to the registry with the specified modelName.
     *
     * @param modelName The name of the iPhone model.
     * @param iPhone    The prototype object to be added to the registry.
     */
    public void addPrototypeWithModelName(String modelName, IPhone iPhone) {
        registry.put(modelName, iPhone);
    }

}
