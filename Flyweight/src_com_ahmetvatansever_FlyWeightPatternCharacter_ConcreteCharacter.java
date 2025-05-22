package com.ahmetvatansever.FlyWeightPatternCharacter;

public class ConcreteCharacter implements Character {
    //intricsic state
    private char character;

    public ConcreteCharacter(char character) {
        this.character = character;
    }

    @Override
    public void display(String font) {
        //font : extrinsic state
        System.out.println("Character: " + character + ", Font: " + font);
    }
}
