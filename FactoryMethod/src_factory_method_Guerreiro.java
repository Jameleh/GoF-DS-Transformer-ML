package factory.method;
/**
 *
 * @author Ygor
 */
public class Guerreiro extends Personagem{
    
    public Guerreiro() {
        super(
                88,
                55,
                82,
                39,
                39,
                38,
                "Armadura Pesada",
                "Espada",
                "guerreiro.jpg");
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
