public class HabilidadeForte implements Habilidade{

    public float calcular(float dano, float velocidade) {
        return velocidade + (2 * dano);
    }
}
