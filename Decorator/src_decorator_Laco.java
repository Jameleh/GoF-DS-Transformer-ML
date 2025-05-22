package decorator;
/**
 *
 * @author Ygor
 */
public class Laco extends EnfeitesDeArvore{
    	public Laco(ArvoreDeNatal arvore){
		super(arvore);
	}

	@Override
	public void adicionar(){
		super.adicionar();
		System.out.println("adicionou Laços");
	}    
}
