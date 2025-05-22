/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpabstractfactory.factory;

import com.mycompany.week11tpabstractfactory.banque.Banque;
import com.mycompany.week11tpabstractfactory.pret.Pret;

/**
 *
 * @author JiJi
 */
public abstract class AbstractFactory {
    
    public abstract Banque getBanque(String banque);
    
    public abstract Pret getPret(String typePret);
}
