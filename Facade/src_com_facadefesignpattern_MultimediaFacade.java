package com.facadefesignpattern;

public class MultimediaFacade {
    final  AudioPlayer audioPlayer;

    final VideoPlayer videoPlayer;
    final Projector projector;

    public MultimediaFacade() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        projector = new Projector();

    }

    void playAudio(String audio){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.turnOn();
        audioPlayer.turnOff();
        audioPlayer.play(audio);
    }
    void playVideo(String video){
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.turnOn();
        videoPlayer.play(video);
        videoPlayer.turnOff();

    }
    void projectOnScreen(){
        Projector projector =  new Projector();
        projector.turnOn();
        projector.projectOnScreen();
        projector.turnOff();
    }
}
