package io.turntabl.hometheater.subsystem.electronicdevice;

public class PopcornPopper extends ElectronicDevice{
    public PopcornPopper() {}

    public void pop() {
        System.out.println("kindly have some popcorn");
    }

    @Override
    public String toString() {
        return "Popcorn popper";
    }
}
