package main.memento;

public class GameMemento {

    private final int health, level, score;

    public GameMemento(int health, int level, int score) {
        this.health = health;
        this.level = level;
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
