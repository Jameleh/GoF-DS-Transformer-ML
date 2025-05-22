package factory.method;
/**
 *
 * @author Ygor
 */
public class AssassinoFactory extends PersonagemFactory{

    @Override
    public void criarPersonagem() {
            personagem.add(new Assassino());
    }
}
