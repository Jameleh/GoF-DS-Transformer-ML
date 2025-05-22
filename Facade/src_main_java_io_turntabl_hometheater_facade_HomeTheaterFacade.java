package io.turntabl.hometheater.facade;

import io.turntabl.hometheater.subsystem.electronicdevice.*;
import io.turntabl.hometheater.subsystem.screen.Screen;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final StreamingPlayer streamingPlayer;
    private final Projector projector;
    private final TheaterLights theaterLights;
    private final Screen screen;
    private final PopcornPopper popcornPopper;

    public HomeTheaterFacade() {
        Tuner tuner = new Tuner();
        this.amplifier = new Amplifier(tuner);
        this.theaterLights = new TheaterLights();
        this.streamingPlayer = new StreamingPlayer(amplifier);
        this.projector = new Projector( streamingPlayer);
        this.screen = new Screen();
        this.popcornPopper = new PopcornPopper();
    }

    public void watchAMovie (String movie){
        System.out.println("Get ready to watch ===> " + movie.toUpperCase());
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundingSound();
        streamingPlayer.on();
        streamingPlayer.play();
    }

    public void endMovie() {
        System.out.println("End of Movie...Shutting movie theater down");
        theaterLights.on();
        streamingPlayer.stop();
        streamingPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        popcornPopper.off();
    }
}
