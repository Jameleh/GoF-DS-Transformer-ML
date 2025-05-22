/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpabstractfactory.pret;

import com.mycompany.week11tpabstractfactory.banque.Banque;
import com.mycompany.week11tpabstractfactory.factory.AbstractFactory;

/**
 *
 * @author JiJi
 */
public class PretFactory extends AbstractFactory{

    @Override
    public Banque getBanque(String banque) {
       return null;
    }

    @Override
    public Pret getPret(String typePret) {
    
        switch (typePret) {
            case "Maison" : return new PretMaison();
            case "Business" : return new PretBusiness();
            case "Education" : return new PretEducation();

            default: return null;
        }
    }
    
    
}
