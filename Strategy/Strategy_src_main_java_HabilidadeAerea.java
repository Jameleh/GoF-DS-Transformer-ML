public class HabilidadeAerea implements Habilidade{

    public float calcular(float dano, float velocidade) {
        return (1.8f * velocidade) + (1.2f * dano);
    }
}