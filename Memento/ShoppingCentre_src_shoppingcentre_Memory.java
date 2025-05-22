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
public class Memory {
    
        public Memento ProductMemento;
    
        public Memento getProductMemento(){
            return ProductMemento;
    }
    
        public void setProductId(Memento ProductMemento){
            this.ProductMemento= ProductMemento;
    }
    
}
