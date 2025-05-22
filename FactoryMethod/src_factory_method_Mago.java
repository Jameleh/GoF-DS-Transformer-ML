package factory.method;
/**
 *
 * @author Ygor
 */
public class Mago extends Personagem{
    
    public Mago() {
        super(
                38,
                27,
                41,
                79,
                78,
                78,
                "Robe",
                "Cajado",
                "mago.jpg");
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
