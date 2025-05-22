package com.behavioral.ChainOfResponsibilityDesignPattern;

public class ErrorLogger implements Logger{
	private Logger nextLogger;
	
	public ErrorLogger(Logger logger) {
		this.nextLogger=logger;
	}

	@Override
	public void logMessage(LogLevel level, String message) {
		if(level==LogLevel.ERROR) {
			System.out.println("ErrorLogger: "+message);
		}
		else if(nextLogger!=null) {
			nextLogger.logMessage(level, message);
		}
	}

}
