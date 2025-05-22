package flyweight;

public class Teclado {
    private String nome;
    private Caracteristicas caracteristicas;

    public Teclado(String nome, Caracteristicas caracteristicas) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
    }


    public String obterTeclado() {
        return "Teclado{" +
                "nome='" + this.nome + '\'' +
                ", layout='" + caracteristicas.getLayout() + '\''+
                ", keycaps='" + caracteristicas.getKeycaps() + '\''+
                ", switches='" + caracteristicas.getSwitches() + '\''+
                '}';
    }
}
