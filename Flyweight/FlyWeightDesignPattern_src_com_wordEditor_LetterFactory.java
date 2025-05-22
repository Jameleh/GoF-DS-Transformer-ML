package com.wordEditor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
	
	private static Map<Character,Iletter> characterCache=new HashMap<>();
	
	 static Iletter createLetter(char CharacterValue) throws InterruptedException {
		if(characterCache.containsKey(CharacterValue)) {
			return characterCache.get(CharacterValue);
		}
		else {
			//adding sleep method, just to understand the new object creation is heavy and expensive 
			Thread.sleep(5000);
			DocumentCharacterFlyWieght characterObj=new DocumentCharacterFlyWieght(CharacterValue, "Italic", 14);
			characterCache.put(CharacterValue, characterObj);
			return characterObj;
		}
	}

}
