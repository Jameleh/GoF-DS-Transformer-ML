/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OdevBridge;

/**
 *
 * @author Berk Kaya
 */
public class KitapKapak extends Kapak{//Refined

    public KitapKapak(IBoyut boyut, IRenk renk) {
        super(boyut, renk);
    }
        public  void kapakUret(){
            System.out.println("Kitap kapağı üretiliyor");
            super.kapakUret();
            System.out.println("kitap kapağı üretildi");
    }
}
