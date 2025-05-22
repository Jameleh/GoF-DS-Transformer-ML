public class Player {
    private float dano;

    public float getDano() {
        return dano;
    }

    public void danoGolpeRapido(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeRapida());
    }

    public void danoGolpeForte(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeForte());
    }

    public void danoGolpeGiratorio(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeGiratoria());
    }

    public void danoGolpeAereo(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeAerea());
    }

}
