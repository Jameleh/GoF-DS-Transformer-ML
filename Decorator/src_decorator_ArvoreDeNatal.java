package decorator;
/**
 *
 * @author Ygor
 */
public abstract class ArvoreDeNatal {
        protected String tipo;

	public abstract void adicionar();

	public String getTipo(){
		return tipo;
	}
}
