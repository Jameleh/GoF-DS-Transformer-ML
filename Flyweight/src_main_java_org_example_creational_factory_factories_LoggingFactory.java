package org.example.creational.factory.factories;

import org.example.creational.factory.logging.FileLogging;
import org.example.creational.singleton.ILogging;

public class LoggingFactory {
    public ILogging createLogger() {
        return new FileLogging();
    }
}
