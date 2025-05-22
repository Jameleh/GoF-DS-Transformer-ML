package com.behavioral.ChainOfResponsibilityDesignPattern;

public class DebugLogger implements Logger{
	private Logger nextLogger;
	
	public DebugLogger(Logger logger) {
		this.nextLogger=logger;
	}

	@Override
	public void logMessage(LogLevel level, String message) {
		if(level==LogLevel.DEBUG) {
			System.out.println("DebugLogger: "+message);
		}
		else if(nextLogger!=null) {
			nextLogger.logMessage(level, message);
		}
	}

}
