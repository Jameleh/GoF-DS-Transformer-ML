package facade;

public class EstoqueFisico extends Pedido{

    private static EstoqueFisico estoqueFisico = new EstoqueFisico();

    private EstoqueFisico(){};

    public static EstoqueFisico getInstancia() {
        return estoqueFisico;
    }

}
