package prototype;

import java.util.Random;
/**
 *
 * @author Ygor
 */
public class Arvore {
    protected int id = 0;
    protected String especie;
    protected float altura;

    public Arvore(String especie, float altura) {
        this.id = new Random().nextInt(1000);
        this.especie = especie;
        this.altura = altura;
    }

    public Arvore(Arvore arvore) {
        this.id = new Random().nextInt(1000);
        this.especie = arvore.especie;
        this.altura = arvore.altura;
    }
}
