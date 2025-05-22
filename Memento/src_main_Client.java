package main;

import main.caretaker.GameSaveManager;
import main.originator.GameCharacter;

public class Client {
    public static void main(String[] args) {
        GameSaveManager gameSaveManager = new GameSaveManager();
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.playGame();
        gameSaveManager.saveGame(gameCharacter);
        gameCharacter.playGame();
        gameSaveManager.saveGame(gameCharacter);
        gameSaveManager.undo(gameCharacter);
    }
}
