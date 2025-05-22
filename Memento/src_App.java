public class App {
    public static void main(String[] args) throws Exception {

        Editor editor = new Editor();
        HistoricoEditor historico = new HistoricoEditor();

        // Escrever e salvar o texto original
        editor.escreverTexto("Primeiro texto.");
        historico.adicionarMemento(editor.salvar());

        // Escrever e salvar o texto modificado
        editor.escreverTexto("Texto modificado.");
        historico.adicionarMemento(editor.salvar());
        //System.out.println(editor.getTexto());

        // Restaurar o estado anterior
        editor.restaurar(historico.getUltimoMemento());
        System.out.println(editor.getTexto()); // Output: Primeiro texto.
    }

    }
