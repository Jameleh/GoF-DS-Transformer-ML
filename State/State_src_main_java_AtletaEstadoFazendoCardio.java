public class AtletaEstadoFazendoCardio implements AtletaEstado{
    private AtletaEstadoFazendoCardio() {};
    private static AtletaEstadoFazendoCardio instance = new AtletaEstadoFazendoCardio();
    public static AtletaEstadoFazendoCardio getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta FazendoCardio";
    }
    public String descansando(Atleta atleta){
        return "Atleta Descansando";
    }
    public String comendo(Atleta atleta){
        return "Refeicao iniciada";
    }
    public String treinandoMusculacao(Atleta atleta){
        return "Treino não iniciado";
    }

    public String fazendoCardio(Atleta atleta){
        return "Treino não iniciado";
    }
}