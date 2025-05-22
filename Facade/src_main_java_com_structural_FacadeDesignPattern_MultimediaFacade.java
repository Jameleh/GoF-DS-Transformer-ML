package com.structural.FacadeDesignPattern;

public class MultimediaFacade {
	private Projector projector;
	private AudioPlayer audioPlayer;
	private VideoPlayer videoPlayer;
	
	public MultimediaFacade() {
		this.projector = new Projector();
		this.audioPlayer = new AudioPlayer();
		this.videoPlayer = new VideoPlayer();
	}
	
	public void playMovie() {
		projector.turnOn();
		audioPlayer.playAudio();
		videoPlayer.playVideo();
	}
	
	public void stopMovie() {
		audioPlayer.stopAudio();
		videoPlayer.stopVideo();
		projector.turnOff();
	}
}
