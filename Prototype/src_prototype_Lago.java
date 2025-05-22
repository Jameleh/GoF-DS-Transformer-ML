package prototype;

import java.util.Random;
/**
 *
 * @author Ygor
 */
public class Lago {
    protected int id;
    protected float largura;
    protected float comprimento;
    protected float profundidade;

    public Lago(float largura, float comprimento, float profundidade) {
        this.id = new Random().nextInt(1000);
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;
    }
    
    public Lago(Lago lago){
        this.id = new Random().nextInt(1000);
        this.largura = lago.largura;
        this.comprimento = lago.comprimento;
        this.profundidade = lago.profundidade;
    }
    
}
