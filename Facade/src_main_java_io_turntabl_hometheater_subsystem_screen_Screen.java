package io.turntabl.hometheater.subsystem.screen;

public class Screen {
    public Screen() {}

    public void up() {
        System.out.println("The Screen has being rolled up.");
    }

    public void down() {
        System.out.println("The Screen has being rolled down");
    }

    @Override
    public String toString() {
        return "Screen";
    }
}
