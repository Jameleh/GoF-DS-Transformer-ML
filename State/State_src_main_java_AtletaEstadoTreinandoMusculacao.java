public class AtletaEstadoTreinandoMusculacao implements AtletaEstado {
    private AtletaEstadoTreinandoMusculacao() {};
    private static AtletaEstadoTreinandoMusculacao instance = new AtletaEstadoTreinandoMusculacao();
    public static AtletaEstadoTreinandoMusculacao getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta TreinandoMusculacao";
    }
    public String descansando(Atleta atleta){
        return "Atleta Descansando";
    }
    public String comendo(Atleta atleta){
        return "Refeicao não iniciada";
    }
    public String treinandoMusculacao(Atleta atleta){
        return "Treino não iniciado";
    }
    public String fazendoCardio(Atleta atleta){
        return "Treino não iniciado";
    }

}