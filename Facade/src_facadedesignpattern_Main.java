/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

import java.util.Scanner;

/**
 *
 * @author anac
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu combo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.criarCombo(tipo);
        System.out.println(combo);
    }
}