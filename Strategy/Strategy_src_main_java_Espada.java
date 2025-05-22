public class Espada {

    private float forca;
    private float velocidade;

    public Espada(float forca, float velocidade) {
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public float calcularDano(Habilidade habilidade) {
        return habilidade.calcular(forca, velocidade);
    }
}
