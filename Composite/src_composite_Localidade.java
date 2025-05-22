package composite;
/**
 *
 * @author Ygor
 */
public abstract class Localidade {
	String local;
	
	public Localidade(String local) {
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public abstract void exibirLocalidade();
}
