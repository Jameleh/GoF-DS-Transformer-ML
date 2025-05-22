/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projiterator;

import static java.awt.PageAttributes.MediaType.B;
import java.util.ArrayList;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */
public class PancakeHouseMenu{
    
    ArrayList menuItens;

//<editor-fold defaultstate="collapsed" desc="Definição do cardápio">
    
      public PancakeHouseMenu() {
        
        menuItens = new ArrayList();

        this.addItem("KB Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99);
        this.addItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99);
        this.addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
        this.addItem("Waffles","Waffles, with your choice of blueberries or strawberries",true,3.59);
    
    }
    
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Método para adicionar item ao cardápio">
    
      public void addItem(String name, String description,boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItens.add(menuItem);
    }    
      
//</editor-fold>
  
//<editor-fold defaultstate="collapsed" desc="Apresenta itens do menu">
    public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItens);
}    
//</editor-fold>
    

}
