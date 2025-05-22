package designpattern.comportamentais;

public class QuartoEstadoOculpado implements QuartoEstado{
    private QuartoEstadoOculpado(){};
    private static QuartoEstadoOculpado instance = new QuartoEstadoOculpado();
    public static QuartoEstadoOculpado getInstance(){
        return instance;
    }

    public String getNameState() {
        return "Oculpado";
    }
}
