package decorator;
/**
 *
 * @author Ygor
 */
public class Boneco extends EnfeitesDeArvore {
    	public Boneco(ArvoreDeNatal arvore){
		super(arvore);
	}

	@Override
	public void adicionar(){
		super.adicionar();
		System.out.println("adicionou Bonecos");
	}
}
