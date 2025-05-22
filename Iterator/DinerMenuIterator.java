/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projiterator;


/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */
public class DinerMenuIterator implements Iterator {

    
    MenuItem[] itens;
    int position = 0;
    
    
    public DinerMenuIterator(MenuItem[] itens) {
        this.itens = itens;
    }
    
    
    @Override
    public boolean hasNext() {
    
        if (position >= itens.length || itens[position] == null) {
            return false;
            } else {
            return true;
            }
    }
    
    

    @Override
    public Object next() {

        MenuItem menuItem = itens[position];
        position = position + 1;
        return menuItem;

    }
    
}
