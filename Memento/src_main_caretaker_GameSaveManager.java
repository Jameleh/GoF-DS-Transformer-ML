package main.caretaker;

import main.memento.GameMemento;
import main.originator.GameCharacter;

import java.util.Stack;

public class GameSaveManager {

    private final Stack<GameMemento> savedStates;

    public GameSaveManager() {
        savedStates = new Stack<>();
    }

    public void saveGame(GameCharacter gameCharacter){
        savedStates.add(gameCharacter.createMemento());
    }

    public void undo(GameCharacter gameCharacter){
        if(!savedStates.isEmpty()){
            savedStates.pop();
        }
        if(savedStates.isEmpty()){
            System.out.println("No previous saved checkpoints");
        }
        else{
            gameCharacter.restoreMemento(savedStates.peek());
        }
    }

}
