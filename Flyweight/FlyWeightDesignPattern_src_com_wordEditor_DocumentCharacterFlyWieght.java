package com.wordEditor;

public class DocumentCharacterFlyWieght implements Iletter {

	//The below properties are intrnisic properties
	private char character;
	private String fontStyle;
	private int size;

	public DocumentCharacterFlyWieght(char character, String fontStyle, int size) {
		super();
		this.character = character;
		this.fontStyle = fontStyle;
		this.size = size;
	}

	public char getCharacter() {
		return character;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void display(int row, int column) {
		System.out.print(this.character+" of syle "+this.fontStyle+" of size "+this.size+" at "+row+" row and "+column+" column");
		System.out.println();
	}

}
