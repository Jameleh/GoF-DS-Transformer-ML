/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpabstractfactory.banque;

/**
 *
 * @author JiJi
 */
public class Banque2 implements Banque{
    
    private final String nom;
    
    public Banque2(){
        this.nom = "Banque 2";
    }

    @Override
    public String getNomBanque() {
        return this.nom;
    }
    
}
