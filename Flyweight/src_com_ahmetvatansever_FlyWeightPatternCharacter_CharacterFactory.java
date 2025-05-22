package com.ahmetvatansever.FlyWeightPatternCharacter;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, Character> characterCache;

    public CharacterFactory() {
        characterCache = new HashMap<>();
    }

    public Character getCharacter(char c){
        Character character = characterCache.get(c);
        if (character == null) {
            character = new ConcreteCharacter(c);
            characterCache.put(c, character);
        }
        System.out.println("characterCache.size : " + characterCache.size());
        return character;
    }
}
