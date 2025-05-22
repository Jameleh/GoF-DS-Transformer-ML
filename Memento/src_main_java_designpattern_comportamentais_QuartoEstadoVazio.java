package designpattern.comportamentais;

public class QuartoEstadoVazio implements QuartoEstado{
    private QuartoEstadoVazio(){};
    private static QuartoEstadoVazio instance = new QuartoEstadoVazio();
    public static QuartoEstadoVazio getInstance(){
        return instance;
    }

    public String getNameState() {
        return "Vazio";
    }
}
