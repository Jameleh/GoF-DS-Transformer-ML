package ExDesignPatternFacade;
import java.util.Arrays;

public class PratoPrincipal {

    String[] pratos = new String[] {
            "1- Filé de Frango",
            "2- Filé de peixe",
            "3- Filé Mignon"
    };

    public void list() {
        Arrays.stream(pratos).forEach(System.out::println);
    }

    public void escolherPrato(int i) {
        System.out.println("O prato principal escolhido foi: " + pratos[(i-1)]);
    }
}
