package composite;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ygor
 */
public class LocalidadeComposta extends Localidade {
	List<Localidade> localidades = new ArrayList<>();

	public LocalidadeComposta(String local) {
		super(local);
	}
	
	@Override
	public void exibirLocalidade() {
		System.out.println(local);
		for (int i = 0; i < localidades.size(); i++) {
			localidades.get(i).exibirLocalidade();
		}
	}

	public void addLocalidade(Localidade localidade) {
		localidades.add(localidade);
	}
}
