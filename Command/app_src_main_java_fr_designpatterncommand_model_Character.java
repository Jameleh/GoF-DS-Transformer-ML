package fr.designpatterncommand.model;

import java.util.Random;

import fr.designpatterncommand.R;

// TODO: Ajouter une image du perso/ ses déplacements
public class Character {
    private int posX, posY;
    private int characterImg;

    public Character(){
        Random ran= new Random();
        posX = ran.nextInt(7);
        posY = ran.nextInt(4);
        characterImg = R.drawable.character;
    }

    public void changePosition(){
        Random ran=new Random();
        posX = 1 + ran.nextInt(7);
        posY = 1 + ran.nextInt(4);
    }
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getImg(){ return characterImg; }

    public void moveTop(){
        if(posY>1) posY--;
    }

    public void moveBottom(){
        if(posY<5) posY++;
    }

    public void moveLeft(){
        if(posX>1) posX--;
    }

    public void moveRight(){
        if(posX<8) posX++;
    }

}
