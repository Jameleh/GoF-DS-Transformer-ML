package decorator;
/**
 *
 * @author Ygor
 */
public class Bolinha extends EnfeitesDeArvore{
	public Bolinha(ArvoreDeNatal arvore){
		super(arvore);
	}

	@Override
	public void adicionar(){
		super.adicionar();
		System.out.println("adicionou Bolinhas");
	}
}
