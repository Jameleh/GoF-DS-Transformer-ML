package org.example.creational.factory.abstractFactory.factories;


import org.example.creational.factory.abstractFactory.ui.elements.Button;
import org.example.creational.factory.abstractFactory.ui.elements.Input;
import org.example.creational.factory.abstractFactory.ui.elements.WindowsButton;
import org.example.creational.factory.abstractFactory.ui.elements.WindowsInput;

public class WindowsComponentFactory implements UIComponentFactory {

    @Override
    public Button renderButton() {
        return new WindowsButton();
    }

    @Override
    public Input renderInput() {
        return new WindowsInput();
    }
}
