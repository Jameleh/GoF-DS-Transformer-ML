package designpattern.comportamentais;

public class QuartoEstadoCheckout implements QuartoEstado{
    private QuartoEstadoCheckout(){};
    private static QuartoEstadoCheckout instance = new QuartoEstadoCheckout();
    public static QuartoEstadoCheckout getInstance(){
        return instance;
    }

    public String getNameState() {
        return "Checkout";
    }
}
