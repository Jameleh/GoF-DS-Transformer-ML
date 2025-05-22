package decorator;
/**
 *
 * @author Ygor
 */
public abstract class EnfeitesDeArvore extends ArvoreDeNatal {
    protected ArvoreDeNatal arvore;

    public EnfeitesDeArvore(ArvoreDeNatal arvore){
		this.arvore = arvore;
    }
    
    @Override
    public void adicionar() {
        if (arvore != null)
	arvore.adicionar();
    }
}
