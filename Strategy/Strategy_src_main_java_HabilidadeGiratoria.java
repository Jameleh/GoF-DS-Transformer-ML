public class HabilidadeGiratoria implements Habilidade{

    public float calcular(float dano, float velocidade) {
        return (1.5f * velocidade) + (1.5f * dano);
    }
}
