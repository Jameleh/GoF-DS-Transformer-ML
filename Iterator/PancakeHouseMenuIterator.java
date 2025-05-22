/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projiterator;

import java.util.ArrayList;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */
public class PancakeHouseMenuIterator implements Iterator{

    ArrayList itens;
    int position = 0;
        
    public PancakeHouseMenuIterator(ArrayList itens) {
        this.itens = itens;
    }
        
    @Override
    public boolean hasNext() {
        
        
            if (position >= itens.size()) {
                return false;
            } else {
                return true;
            }
 
    }

    @Override
    public Object next() {
                
        MenuItem menuItem = (MenuItem) itens.get(position);
        position = position + 1;
        return menuItem;
    }
    

    
    
}
