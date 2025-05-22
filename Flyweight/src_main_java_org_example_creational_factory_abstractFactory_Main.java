package org.example.creational.factory.abstractFactory;

import org.example.creational.factory.abstractFactory.factories.LinuxComponentFactory;
import org.example.creational.factory.abstractFactory.factories.UIComponentFactory;
import org.example.creational.factory.abstractFactory.factories.WindowsComponentFactory;
import org.example.creational.factory.abstractFactory.services.ApplicationService;

public class Main {
    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        UIComponentFactory factory;

        if (os.contains("windows")) {
            factory = new WindowsComponentFactory();
        } else {
            factory = new LinuxComponentFactory();
        }

        ApplicationService applicationService = new ApplicationService(factory);
        applicationService.render();

    }

}
