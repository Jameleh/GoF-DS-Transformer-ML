package flyweight.example.trees;

import java.awt.*; // Lib GUI

public class TreeType {
    private String name; // Nome do tipo de árvore
    private Color color; // Cor das folhas da árvore
    private String otherTreeData; // Dados adicionais compartilhados 

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    // Método para desenhar árvores em uma posição específica
    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK); // Tronco
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);  // Copa com a cor do tipo
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}