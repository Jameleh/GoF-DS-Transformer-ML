package io.turntabl.hometheater.subsystem.electronicdevice;

public class StreamingPlayer extends ElectronicDevice{
    private final Amplifier amplifier;

    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void pause() {
        System.out.println("Streaming Player has been PAUSED");
    }

    public void play() {
        System.out.println("Streaming Player has started PLAYING");
    }

    public void stop() {
        System.out.println("Streaming Player has been STOPPED");
    }

    public void setSurroundingSound() {
        this.amplifier.setSurroundingSound();
    }

    @Override
    public String toString() {
        return "Streaming player";
    }
}
