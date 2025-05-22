/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OdevBridge;

/**
 *
 * @author Berk Kaya
 */
public class App {
    public static void main(String[] args) {
        KitapKapak k1 = new KitapKapak(new A5(),new Mavi());
        DergiKapak d1 = new DergiKapak(new A4(), new Kirmizi());
        
        k1.kapakUret();
        System.out.println("---------------");
        d1.kapakUret();
    }
}
