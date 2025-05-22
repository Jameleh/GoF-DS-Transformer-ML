package com.facadefesignpattern;

public class Client {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade();

        // Step 7: Testing
        multimediaFacade.playAudio("Background Music");
        multimediaFacade.playVideo("Introduction Video");
        multimediaFacade.projectOnScreen();
    }
}
