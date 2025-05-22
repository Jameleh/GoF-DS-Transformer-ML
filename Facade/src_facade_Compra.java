package facade;
/**
 *
 * @author Ygor
 */
public class Compra {
    private Embalagem em;
    private Estoque est;
    private NotaFiscal nf;
    private Email mail;
    
    public Compra () {
        em = new Embalagem();
        est = new Estoque();
        nf = new NotaFiscal();
        mail = new Email();
    }
    public void compraEfetuada(){
        em.setorEmbalagem();
        est.reduzEstoque(25); //Quantidade de produtos a ser comprados.
        nf.gerandoNota();
        mail.enviandoEmail();
    }
}
