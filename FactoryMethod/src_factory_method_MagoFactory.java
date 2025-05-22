package factory.method;
/**
 *
 * @author Ygor
 */
public class MagoFactory extends PersonagemFactory{

    @Override
    public void criarPersonagem() {
            personagem.add(new Mago());
    }
}
