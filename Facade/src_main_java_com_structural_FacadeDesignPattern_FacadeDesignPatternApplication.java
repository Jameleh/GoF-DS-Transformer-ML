package com.structural.FacadeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacadeDesignPatternApplication.class, args);
		MultimediaFacade multimediaFacade = new MultimediaFacade();
		multimediaFacade.playMovie();
		System.out.println("Watching the movie...");
		multimediaFacade.stopMovie();
	}
}
