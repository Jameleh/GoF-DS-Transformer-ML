package io.turntabl.hometheater.subsystem.electronicdevice;

import io.turntabl.hometheater.enums.Volume;

public class Amplifier extends ElectronicDevice{
    private Tuner tuner;

    public Amplifier(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(Volume volume) {
    }

    public void setSurroundingSound() {
        System.out.println("Enjoy a studio sound effect.");
    }

    @Override
    public String toString() {
        return "Amplifier";
    }
}
