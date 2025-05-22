package flyweight.example.trees;

import java.awt.*; // Lib GUI

public class Tree {
    private int x;   // Coordenada x da árvore
    private int y;   // Coordenada y da árvore
    private TreeType type; // Tipo de árvore compartilhado (Flyweight)

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    // Método para desenhar a árvore
    public void draw(Graphics g) {
        type.draw(g, x, y); // Usa o método draw do TreeType associado
    }
}