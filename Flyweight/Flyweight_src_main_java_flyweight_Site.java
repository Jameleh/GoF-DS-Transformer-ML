package flyweight;
import java.util.ArrayList;
import java.util.List;

public class Site {
    private List<Teclado> teclados = new ArrayList<>();

    public void adicionar(String nomeTeclado, String layout, String codBarras, String keycaps, String switches) {
        Caracteristicas caracteristicas = CaracteristicasFactory.getCaracteristicas(layout, codBarras, keycaps, switches);
        Teclado teclado = new Teclado(nomeTeclado, caracteristicas);
        teclados.add(teclado);
    }

    public List<String> obterTodosTeclados() {
        List<String> saida = new ArrayList<String>();
        for (Teclado teclado : this.teclados) {
            saida.add(teclado.obterTeclado());
        }
        return saida;
    }
}
