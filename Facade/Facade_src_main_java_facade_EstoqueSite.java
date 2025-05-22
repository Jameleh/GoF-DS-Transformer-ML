package facade;

public class EstoqueSite extends Pedido{

    private static EstoqueSite estoqueSite = new EstoqueSite();

    private EstoqueSite(){};

    public static EstoqueSite getInstancia() {
        return estoqueSite;
    }
}
