/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern;

/**
 *
 * @author anac
 */
public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        if (tipo == 1) {
            burguer = new Burguer("Burger Master", 10.0, 200);
            sobremesa = new Sobremesa("Sobremesa Master", 5.0, "Grande");
            bebida = new Bebida("Bebida Master", 2.0, 500);
        } else if (tipo == 2) {
            burguer = new Burguer("Super Burger", 12.0, 250);
            sobremesa = new Sobremesa("Super Sobremesa", 6.0, "Médio");
            bebida = new Bebida("Super Bebida", 2.5, 700);
        }
    }

    public String toString() {
        return "Combo: \n" +
                "Burguer: " + burguer.getDescricao() + ", " + burguer.getGramas() + "g, R$ " + burguer.getPreco() + "\n" +
                "Sobremesa: " + sobremesa.getDescricao() + ", " + sobremesa.getTamanho() + ", R$ " + sobremesa.getPreco() + "\n" +
                "Bebida: " + bebida.getDescricao() + ", " + bebida.getMl() + "ml, R$ " + bebida.getPreco();
    }
}
