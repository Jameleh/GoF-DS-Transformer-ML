package Laptops.factories;

import Laptops.MacBookPro;
import Laptops.Laptop;


public class MacBookProFactory implements LaptopFactory {

 @Override
 public Laptop createLaptop() {
     return new MacBookPro("MacBook Pro", 200000.0);
     
 }
}

