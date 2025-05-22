public class HabilidadeRapida implements Habilidade{

    public float calcular(float dano, float velocidade) {
            return dano + (2 * velocidade);
    }
}
