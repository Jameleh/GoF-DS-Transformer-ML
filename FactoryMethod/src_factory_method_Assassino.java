package factory.method;
/**
 *
 * @author Ygor
 */
public class Assassino extends Personagem{
    
    public Assassino() {
        super(
                82,
                61,
                82,
                41,
                38,
                37,
                "Armadura Leve",
                "Arco",
                "assassino.jpg");
        System.out.println("STR: "+this.str +"\n"+
                "DEX: "+this.dex +"\n"+ 
                "CON: "+this.con +"\n"+ 
                "INT: "+this.inte +"\n"+ 
                "WIT: "+this.wit +"\n"+ 
                "MEN: "+this.men +"\n"+
                "ARMADURA: "+this.armadura +"\n"+
                "ARMA: "+this.arma);
    }

}
