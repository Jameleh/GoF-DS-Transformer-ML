package org.example.Factory;

import org.example.Product.Candy;
import org.example.Product.HardCandy;
import org.example.Product.MintyCandy;
import org.example.enums.CandyType;

public class CandyFactory {
    public static Candy getCandy(CandyType type) {
        if(type == CandyType.HARD) {
            return new HardCandy();
        } else if(type == CandyType.MINTY) {
            return new MintyCandy();
        }
        return null;
    }
}
