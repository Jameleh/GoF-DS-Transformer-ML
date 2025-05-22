package factory.method;
/**
 *
 * @author Ygor
 */
public class GuerreiroFactory extends PersonagemFactory{

    @Override
    public void criarPersonagem() {
            personagem.add(new Guerreiro());
    }
}
