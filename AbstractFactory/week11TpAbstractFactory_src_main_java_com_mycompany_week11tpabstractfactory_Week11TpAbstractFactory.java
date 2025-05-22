/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week11tpabstractfactory;

import com.mycompany.week11tpabstractfactory.banque.Banque;
import com.mycompany.week11tpabstractfactory.factory.AbstractFactory;
import com.mycompany.week11tpabstractfactory.factory.FactoryCreator;
import com.mycompany.week11tpabstractfactory.pret.Pret;
import java.util.Scanner;

/**
 *
 * @author JiJi
 */
public class Week11TpAbstractFactory {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saisir le nom de votre banque");
        String banque = scanner.nextLine();
        
        System.out.println("Saisir le type de pret");
        String typePretClient = scanner.nextLine();
        
        System.out.println("Saisir le montant du pret");
        double montantPret  = scanner.nextDouble();
        
        AbstractFactory banqueFactory = FactoryCreator.getFactory("Banque");
        Banque b = banqueFactory.getBanque(banque);
        
        System.out.println("Vous allez faire un pret à la banque " + b.getNomBanque());
        
        AbstractFactory pretFactory = FactoryCreator.getFactory("Pret");
        
        Pret pret = pretFactory.getPret(typePretClient);
        pret.setTaux();
        pret.calculerPaiementPret(montantPret);
        
        
    }
}
