package com.main.pattern;

public class Mp3file implements MediaPlayer {
	private String fileType;  
	private String format;
	private String fileName;
	public Mp3file(String fileType, String fileName) {
		this.fileType =fileType;
		this.format = "mp3";
		this.fileName = fileName;
	}
	@Override
	public String getFileType() {
		// TODO Auto-generated method stub
		return fileType;
	}

	@Override
	public String getFormat() {
		// TODO Auto-generated method stub
		return format;
	}

	
	@Override
	public void addfile(MediaPlayer mediaPlayer) {
		// This is leaf so no need of adding file
	}

	
	@Override
	public MediaPlayer getChild(int i) {
		return null;
		// This is leaf so no need of getting child

	}
	
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return fileName;
	}
	@Override
	public void print() {
		 System.out.println("=========================="); 
		 System.out.println("FileName ="+getFileName()); 
	     System.out.println("FileType ="+getFileType());  
	     System.out.println("Format ="+getFormat());  
	     System.out.println("==========================");

	}
}
