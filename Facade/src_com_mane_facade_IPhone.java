package com.mane.facade;

public class IPhone implements Phone {

    @Override
    public String build() {
        return "Built using iOS 15";
    }
}
