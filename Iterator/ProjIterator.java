/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.projiterator;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */
public class ProjIterator {

    public static void main(String[] args) {
        
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        
        DinerMenu dinerMenu = new DinerMenu();
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        
        waitress.printMenu();
    }
}
