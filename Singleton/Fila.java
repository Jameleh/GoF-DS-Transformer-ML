package exerciciosingleton;

public class Fila {
    private static Fila instance;

    private Fila() {
    }

    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

    public void ImprimeDocumento() {
    }

    public void RemoveDocumento() {
    }

    public void RemoveTodosDocumentos() {
    }
}
