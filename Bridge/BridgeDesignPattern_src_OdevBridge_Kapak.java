/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OdevBridge;

/**
 *
 * @author Berk Kaya
 */
public abstract class Kapak {//abstraction
    private IBoyut boyut;//Bridge
    private IRenk renk;//Bridge

    public Kapak(IBoyut boyut, IRenk renk) {
        this.boyut = boyut;
        this.renk = renk;
    }
    
    public  void kapakUret(){
        boyut.boyutAta();
        renk.renkAta();
    }
    
}
