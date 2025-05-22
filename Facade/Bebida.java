package ExDesignPatternFacade;

import java.util.Arrays;

public class Bebida {

    String[] bebidas = new String[] {
            "1- Água",
            "2- Suco de Laranja",
            "3- Coca-Cola"
    };

    public void list() {
        Arrays.stream(bebidas).forEach(System.out::println);
    }

    public void escolherBebida(int i) {
        System.out.println("A bebida escolhida foi: " + bebidas[(i-1)]);
    }
}
