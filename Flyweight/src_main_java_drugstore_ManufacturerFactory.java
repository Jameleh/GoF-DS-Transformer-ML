package drugstore;

import java.util.*;

public class ManufacturerFactory {

    private static Map<String, Manufacturer> manufacturerMap = new HashMap<>();

    Manufacturer getManufacturer(String name, String country){
        Manufacturer manufacturer = manufacturerMap.get(name);
        if(manufacturer == null){
            manufacturer = new Manufacturer(name, country);
            manufacturerMap.put(name, manufacturer);
        }

        return manufacturer;
    }

    public static List<Manufacturer> getManufacturers(){
        return new ArrayList<>(manufacturerMap.values());
    }


}
