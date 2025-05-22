/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.week11tpabstractfactory.pret;

/**
 *
 * @author JiJi
 */
public abstract class Pret {
    
    protected double taux;
    public abstract void setTaux();
    
    
    public void calculerPaiementPret(double montantPret){
    
        double paiement = montantPret * (1 + this.taux/100);
        
        System.out.println("Vous allez devoir payer " + paiement + " pour le montant de " + montantPret + " avec un taux de " + this.taux);
    }
    
}
