package prototype;

import java.util.Random;
/**
 *
 * @author Ygor
 */
public class Folhagem {
    protected int id = 0;
    protected String especie;
    protected String cor;

    public Folhagem(String especie, String cor) {
        this.id = new Random().nextInt(1000);
        this.especie = especie;
        this.cor = cor;
    }

    public Folhagem(Folhagem folhagem) {
        this.id = new Random().nextInt(1000);
        this.especie = folhagem.especie;
        this.cor = folhagem.cor;
    }   
}
