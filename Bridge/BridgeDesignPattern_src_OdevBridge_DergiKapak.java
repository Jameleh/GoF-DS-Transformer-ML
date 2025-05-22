/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OdevBridge;

/**
 *
 * @author Berk Kaya
 */
public class DergiKapak extends Kapak{//Refined

    public DergiKapak(IBoyut boyut, IRenk renk) {
        super(boyut, renk);
    }
            public  void kapakUret(){
            System.out.println("Dergi kapağı üretiliyor");
            super.kapakUret();
            System.out.println("Dergi kapağı üretildi");
    }
}
