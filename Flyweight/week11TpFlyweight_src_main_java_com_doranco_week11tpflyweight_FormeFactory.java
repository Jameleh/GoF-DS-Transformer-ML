/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpflyweight;

import java.util.HashMap;

/**
 *
 * @author JiJi
 */
public class FormeFactory {
    
    private static final HashMap<TypeForme, Forme> formes = new HashMap<TypeForme, Forme>();
    
    
    public static Forme getForme(TypeForme type){
    
        Forme formeImpl = formes.get(type);
        
        if (formeImpl == null) {
            if(type.equals(TypeForme.OVAL_FILL)){
            formeImpl = new Ovale(true);
        }else if (type.equals(TypeForme.OVAL_NOFILL)){ 
                formeImpl = new Ovale(false);
        }else if (type.equals(TypeForme.LINE)){
                formeImpl = new Ligne();
                }
            
        formes.put(type, formeImpl);
        
        }
        return formeImpl;
    }

    
    public static enum TypeForme{
    
        OVAL_FILL,OVAL_NOFILL,LINE
    }
    
}
