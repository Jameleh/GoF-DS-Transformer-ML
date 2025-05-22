/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projiterator;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */

    
    public class Waitress {
    
        //<editor-fold defaultstate="collapsed" desc="Atributos">
        
        PancakeHouseMenu pancakeHouseMenu;
        DinerMenu dinerMenu;
        
//</editor-fold>
    
        //<editor-fold defaultstate="collapsed" desc="Construtor">
            
        public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
            
                this.pancakeHouseMenu = pancakeHouseMenu;
                this.dinerMenu = dinerMenu;
        }    
//</editor-fold>
        

        
        public void printMenu() {
        
                Iterator pancakeIterator = pancakeHouseMenu.createIterator();
                Iterator dinerIterator = dinerMenu.createIterator();
        
                System.out.println("MENU\n----\nBREAKFAST");
                printMenu(pancakeIterator);
                
                System.out.println("\nLUNCH");
                printMenu(dinerIterator);
        }
        
        
        private void printMenu(Iterator iterator) {
            
            while (iterator.hasNext()) {
                
                MenuItem menuItem = (MenuItem)iterator.next();
                
                System.out.print(menuItem.getName() + "," );
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }

}
    
    
    

