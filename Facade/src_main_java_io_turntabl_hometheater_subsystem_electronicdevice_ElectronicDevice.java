package io.turntabl.hometheater.subsystem.electronicdevice;

public abstract class ElectronicDevice {

    public ElectronicDevice() {}

    public void on() {
        System.out.println(this + " is now ON");
    }

    public void off() {
        System.out.println(this + " is now OFF");
    }

    @Override
    public String toString() {
        return "Electronic Device = " + this + " }";
    }
}
