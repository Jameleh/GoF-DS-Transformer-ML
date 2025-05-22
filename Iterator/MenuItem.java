/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projiterator;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */
public class MenuItem {
  
//<editor-fold defaultstate="collapsed" desc="Atributos">
    String name;
    String description;
    boolean vegetarian;
    double price;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public MenuItem(String name,String description,boolean vegetarian,double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters e Setters">
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
//</editor-fold>
        
//<editor-fold defaultstate="collapsed" desc="Métodos">
    public boolean isVegetarian() {
        return vegetarian;
    }
//</editor-fold>
    
    

    

    
    
    

}
