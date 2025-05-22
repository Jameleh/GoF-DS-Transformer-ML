package io.turntabl.hometheater.subsystem.electronicdevice;

public class Projector extends ElectronicDevice{
    private StreamingPlayer streamingPlayer;

    public Projector(StreamingPlayer streamingPlayer) {
        this.streamingPlayer = streamingPlayer;
    }

    public void tvMode() {
        System.out.println("Projector is now in TV mode.");
    }

    public void wideScreenMode() {
        System.out.println("Projector is in screen mode");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
