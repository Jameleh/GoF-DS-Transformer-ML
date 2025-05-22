package io.turntabl.hometheater.subsystem.electronicdevice;

public class TheaterLights extends ElectronicDevice{
    private int intensity;

    public TheaterLights() {}

    public void dim(int intensity) {
        System.out.println("Lights now dim by " + intensity + " candela");
    }

    @Override
    public String toString() {
        return "Theater lights";
    }
}
