/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpabstractfactory.banque;

import com.mycompany.week11tpabstractfactory.factory.AbstractFactory;
import com.mycompany.week11tpabstractfactory.pret.Pret;

/**
 *
 * @author JiJi
 */
public class BanqueFactory extends AbstractFactory{

    @Override
    public Banque getBanque(String banque) {
     
        switch (banque) {
            case "Banque 1" : return new Banque1();
            case "Banque 2" : return new Banque2();
            case "Banque 3" : return new Banque3();

            
            default : return null;
        }
    }
    
    @Override
    public Pret getPret(String typePret){
        return null;
    }
    
    
    
}
