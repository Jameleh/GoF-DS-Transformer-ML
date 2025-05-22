package ExDesignPatternFacade;

import java.util.Arrays;

public class Sobremesa {

    String[] sobremesas = new String[] {
            "1- Pudim",
            "2- Sorvete"
    };

    public void list() {
        Arrays.stream(sobremesas).forEach(System.out::println);
    }

    public void escolherSobremesa(int i) {
        System.out.println("A sobremesa escolhida foi: " + sobremesas[(i-1)]);
    }
}
