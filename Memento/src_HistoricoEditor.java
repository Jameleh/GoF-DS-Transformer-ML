import java.util.ArrayList;
import java.util.List;

public class HistoricoEditor {
    private List<EditorMemento> historico = new ArrayList<>();

    public void adicionarMemento(EditorMemento memento) {
        historico.add(memento);
    }

    public EditorMemento getUltimoMemento() {
        if (historico.isEmpty()) {
            return null;
        }
        int index = historico.size() - 1;
        EditorMemento ultimoMemento = historico.get(index);
        historico.remove(index);
        return ultimoMemento;
    }
}
