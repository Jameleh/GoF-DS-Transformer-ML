package io.turntabl.hometheater.client;

import io.turntabl.hometheater.facade.HomeTheaterFacade;

public class HomeTheaterApp {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchAMovie("Pirates of the carribean");

        System.out.println("\n========================================");

        homeTheaterFacade.endMovie();


    }
}
