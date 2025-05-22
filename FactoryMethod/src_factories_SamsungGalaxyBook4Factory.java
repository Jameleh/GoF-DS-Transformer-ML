package Laptops.factories;

import Laptops.SamsungGalaxyBook4;
import Laptops.Laptop;

public class SamsungGalaxyBook4Factory implements LaptopFactory {

 @Override
 public Laptop createLaptop() {
     return new SamsungGalaxyBook4("Samsung Galaxy Book 4", 85990.0);
     
 }
}

