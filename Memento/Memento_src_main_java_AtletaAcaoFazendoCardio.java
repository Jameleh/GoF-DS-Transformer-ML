public class AtletaAcaoFazendoCardio implements AtletaAcao {
    private AtletaAcaoFazendoCardio() {};
    private static AtletaAcaoFazendoCardio instance = new AtletaAcaoFazendoCardio();
    public static AtletaAcaoFazendoCardio getInstance(){
        return instance;
    }
    public String getNomeAcao(){
        return "Fazendo Cardio";
    }

}