package prototype;

import java.util.Random;
/**
 *
 * @author Ygor
 */
public class Ponte {
    protected int id = 0;
    protected float largura;
    protected float comprimento;

    public Ponte(float largura, float comprimento) {
        this.id = new Random().nextInt(1000);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Ponte(Ponte ponte) {
        this.id = new Random().nextInt(1000);
        this.largura = ponte.largura;
        this.comprimento = ponte.comprimento;
    }
}
