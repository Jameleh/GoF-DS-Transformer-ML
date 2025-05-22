/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcentre;

/**
 *
 * @author Lenovo
 */
public class Main {
    
    
        public static void main(String[] args) {
       
        
        
          Product prd = new Product();
          prd.setName("Coffee Porcelain Cup Mag: 30€ ");
          System.out.println(prd.getProductPrice());
             
          Memory memory = new Memory();
          memory.ProductMemento = prd.Save();
          System.out.println("Product is saved.");
          
          prd.ProductPrice = "Coffee Porcelain Cup Mag: 15€";
          System.out.println("Discount: \n" + prd.getProductPrice());
 
           prd.Restore(memory.ProductMemento);
           System.out.println("Undo: \n" +prd.getProductPrice());
        }
    }
    

