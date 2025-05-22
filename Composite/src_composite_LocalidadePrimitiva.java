package composite;
/**
 *
 * @author Ygor
 */
public class LocalidadePrimitiva extends Localidade {
	public LocalidadePrimitiva(String local) {
		super(local);
	}
	
	@Override
	public void exibirLocalidade() {
		System.out.println(local);
	}
}
