package org.example.creational.factory;

import org.example.creational.factory.factories.LoggingFactory;
import org.example.creational.singleton.ILogging;

public class Main {
    public static void main(String[] args) {
        LoggingFactory loggingFactory = new LoggingFactory();

        ILogging logging = loggingFactory.createLogger();
        logging.log();

        ILogging logging1 = loggingFactory.createLogger();
        logging1.log();

        ILogging logging2 = loggingFactory.createLogger();
        logging2.log();

        ILogging logging3 = loggingFactory.createLogger();
        logging3.log();


    }
}
