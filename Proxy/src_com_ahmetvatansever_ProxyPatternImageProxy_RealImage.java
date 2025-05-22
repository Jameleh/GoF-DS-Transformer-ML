package com.ahmetvatansever.ProxyPatternImageProxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading image:" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Display image:" + fileName);
    }
}
