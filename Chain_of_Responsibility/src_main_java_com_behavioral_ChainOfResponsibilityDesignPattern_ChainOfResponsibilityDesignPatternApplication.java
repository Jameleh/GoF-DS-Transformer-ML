package com.behavioral.ChainOfResponsibilityDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChainOfResponsibilityDesignPatternApplication.class, args);
		Logger errorLogger = new ErrorLogger(null);
		Logger debugLogger = new DebugLogger(errorLogger);
		Logger infoLogger = new InfoLogger(debugLogger);
		
		infoLogger.logMessage(LogLevel.INFO, "This is an Information Message");
		infoLogger.logMessage(LogLevel.DEBUG, "This is a Debug Message");
		infoLogger.logMessage(LogLevel.ERROR, "This is a Error Message");
	}
}
