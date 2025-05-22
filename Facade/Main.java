package ExDesignPatternFacade;

public class Main {

    public static void main(String[] args) {

        Combo cb = new Combo();
        System.out.println("- C O M B O   E S C O L H I D O -");
        System.out.println("\nCardápio de Prato Principal: ");
        cb.escolherPratoPrincipal();
        System.out.println("\nCardápio de Bebida: ");
        cb.escolherBebida();
        System.out.println("\nCardápio de Sobremesa: ");
        cb.escolherSobremesa();

    }
}
