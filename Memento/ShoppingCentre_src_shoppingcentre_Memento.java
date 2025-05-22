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
public class Memento {
    
     public String ProductPrice;
        
        public String getProductPrice(){
            return ProductPrice;
        }
    
        public Memento (String ProductPrice){
            this.ProductPrice= ProductPrice;
        }
     
    
}
