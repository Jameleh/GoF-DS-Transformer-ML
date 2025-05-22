package main.originator;

import main.memento.GameMemento;

public class GameCharacter {
    private int health, level, score;

    public GameCharacter() {
        this.health = 100;
        this.level = 1;
        this.score = 0;
        displayStatus();
    }

    public void playGame() {
        this.level++;
        this.score += 2500;
        this.health -= 15;
        displayStatus();
    }

    private void displayStatus() {
        System.out.println("Level: " + this.level + ", Score: " + this.score + ", Health: " + this.health);
    }

    public GameMemento createMemento() {
        return new GameMemento(this.health, this.level, this.score);
    }

    public void restoreMemento(GameMemento gameMemento) {
        this.health = gameMemento.getHealth();
        this.score = gameMemento.getScore();
        this.level = gameMemento.getLevel();
        System.out.println("Restoring previous checkpoint..");
        displayStatus();
    }
}
