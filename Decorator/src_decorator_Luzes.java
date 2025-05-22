package decorator;
/**
 *
 * @author Ygor
 */
public class Luzes extends EnfeitesDeArvore{
    	public Luzes(ArvoreDeNatal arvore){
		super(arvore);
	}

	@Override
	public void adicionar(){
		super.adicionar();
		System.out.println("adicionou Luzes");
	}    
}
