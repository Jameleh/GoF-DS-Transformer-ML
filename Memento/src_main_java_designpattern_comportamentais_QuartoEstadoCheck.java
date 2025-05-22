package designpattern.comportamentais;

public class QuartoEstadoCheck implements QuartoEstado{
    private QuartoEstadoCheck(){};
    private static QuartoEstadoCheck instance = new QuartoEstadoCheck();
    public static QuartoEstadoCheck getInstance(){
        return instance;
    }

    public String getNameState() {
        return "Check";
    }
}
