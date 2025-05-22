package decorator;
/**
 *
 * @author Ygor
 */
public class PinheiroDePapel extends ArvoreDeNatal{
    
	public PinheiroDePapel(String tipo){
		this.tipo = tipo;
	}

	@Override
	public void adicionar(){
		System.out.println("Você acaba de desenhar uma arvore do tipo: " + tipo);
	}
}
