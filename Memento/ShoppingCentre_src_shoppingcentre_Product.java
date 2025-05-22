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
public class Product {
    
    public String ProductPrice;
        
    public String getProductPrice(){
        return ProductPrice;
    }
    
    public void setName(String ProductPrice){
        this.ProductPrice= ProductPrice;
     }
       
    public Memento Save(){  
         return new Memento(ProductPrice);
        }
       
   public void  Restore(Memento memento){  
            
        ProductPrice = memento.getProductPrice();
            }


}
