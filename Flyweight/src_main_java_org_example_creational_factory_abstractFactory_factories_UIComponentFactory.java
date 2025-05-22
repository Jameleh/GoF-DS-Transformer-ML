package org.example.creational.factory.abstractFactory.factories;


import org.example.creational.factory.abstractFactory.ui.elements.Button;
import org.example.creational.factory.abstractFactory.ui.elements.Input;

public interface UIComponentFactory {
    Button renderButton();
    Input renderInput();
}
