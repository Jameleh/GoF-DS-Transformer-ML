package com.wordEditor;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		
		Iletter object1=LetterFactory.createLetter('K');
		object1.display(0, 1);
		
		Iletter object2=LetterFactory.createLetter('A');
		object2.display(0, 2);
		
		Iletter object3=LetterFactory.createLetter('V');
		object3.display(0, 3);
	
		Iletter object4=LetterFactory.createLetter('A');
		object4.display(0, 4);
		
		Iletter object5=LetterFactory.createLetter('N');
		object5.display(0, 5);
		
	}
	
	/*
	 * The output in wordEditor would be like 
	 * KAVAN
	 */

}
