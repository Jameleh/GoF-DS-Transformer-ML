import frase.impl.Observador;
import frase.impl.Observavel;

public class Frase {
    public static void main(String[] args) {

        // Criando o observavel (subject) netflix.
        Observavel frase = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);

        frase.registraObservador(obs1);
        frase.registraObservador(obs2);

        frase.setNovaFrase("Aqui está a nova frase");

        frase.removeObservador(obs2);

        System.out.println("\n\nMandando notificação para todos os clientes: ");
        frase.notificaObservadores();
    }
}
