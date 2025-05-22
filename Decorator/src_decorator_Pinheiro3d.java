package decorator;
/**
 *
 * @author Ygor
 */
public class Pinheiro3d extends ArvoreDeNatal{
    
	public Pinheiro3d(String tipo){
		this.tipo = tipo;
	}

	@Override
	public void adicionar(){
		System.out.println("Você acaba de criar uma arvore do tipo: " + tipo);
	}
}
