package org.example;

import org.example.client.DrawingClient;

public class Main {
    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(1000, 1000);
        drawing.setTitle("Flyweight Design Pattern");
    }
}