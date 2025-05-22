package decorator;
/**
 *
 * @author Ygor
 */
public class PinheiroDeCroche extends ArvoreDeNatal{
    
	public PinheiroDeCroche(String tipo){
		this.tipo = tipo;
	}

	@Override
	public void adicionar(){
		System.out.println("Você acaba de costurar uma arvore do tipo: " + tipo);
	}
}
