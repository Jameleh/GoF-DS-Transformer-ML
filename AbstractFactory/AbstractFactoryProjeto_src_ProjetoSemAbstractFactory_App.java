package ProjetoSemAbstractFactory;

public class App {
    public static void main(String[] args) throws Exception {
        PaoFrances paoFrances = new PaoFrances();
        System.out.println("Pão Francês:");
        System.out.println("Ingredientes: " + paoFrances.getIngredientes());
        System.out.println("Modo de Preparo: " + paoFrances.getModoPreparo());
        System.out.println("Sabor: " + paoFrances.getSabor());

        PaoDeMilho paoDeMilho = new PaoDeMilho();
        System.out.println("\nPão de Milho:");
        System.out.println("Ingredientes: " + paoDeMilho.getIngredientes());
        System.out.println("Modo de Preparo: " + paoDeMilho.getModoPreparo());
        System.out.println("Sabor: " + paoDeMilho.getSabor());

        PaoIntegral paoIntegral = new PaoIntegral();
        System.out.println("\nPão Integral:");
        System.out.println("Ingredientes: " + paoIntegral.getIngredientes());
        System.out.println("Modo de Preparo: " + paoIntegral.getModoPreparo());
        System.out.println("Sabor: " + paoIntegral.getSabor());
    }
}
