package org.example.creational.factory.abstractFactory.factories;

import org.example.creational.factory.abstractFactory.ui.elements.Button;
import org.example.creational.factory.abstractFactory.ui.elements.Input;
import org.example.creational.factory.abstractFactory.ui.elements.LinuxButton;
import org.example.creational.factory.abstractFactory.ui.elements.LinuxInput;

public class LinuxComponentFactory implements UIComponentFactory{
    @Override
    public Button renderButton() {
        return new LinuxButton();
    }

    @Override
    public Input renderInput() {
        return new LinuxInput();
    }
}
