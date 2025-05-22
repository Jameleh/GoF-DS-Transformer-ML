/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpabstractfactory.banque;

/**
 *
 * @author JiJi
 */
public class Banque1 implements Banque{
    
    private final String nom;
    
    public Banque1(){
        this.nom = "Banque 1";
    }

    @Override
    public String getNomBanque() {
        return this.nom;
    }
    
}
