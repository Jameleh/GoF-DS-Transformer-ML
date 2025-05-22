package com.behavioral.ChainOfResponsibilityDesignPattern;

public class InfoLogger implements Logger{
	private Logger nextLogger;
	
	public InfoLogger(Logger logger) {
		this.nextLogger=logger;
	}

	@Override
	public void logMessage(LogLevel level, String message) {
		if(level==LogLevel.INFO) {
			System.out.println("InfoLogger: "+message);
		}
		else if(nextLogger!=null) {
			nextLogger.logMessage(level, message);
		}
	}

}
