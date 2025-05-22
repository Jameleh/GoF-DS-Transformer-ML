package ProjetoComAbstractFactory;

import java.util.Scanner;

import ProjetoComAbstractFactory.Interface.Pao;
import ProjetoComAbstractFactory.Fabricas.PaoFactory;
import ProjetoComAbstractFactory.Fabricas.PaoDeMilhoConcretoFactory;
import ProjetoComAbstractFactory.Fabricas.PaoFrancesConcretoFactory;
import ProjetoComAbstractFactory.Fabricas.PaoIntegralConcretoFactory;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de pão:");
        System.out.println("1 - Pão Francês");
        System.out.println("2 - Pão de Milho");
        System.out.println("3 - Pão Integral");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        PaoFactory fabrica;
        Pao pao;

        switch (opcao) {
            case 1:
                fabrica = new PaoFrancesConcretoFactory();
                pao = fabrica.criarPaoFrances();
                break;
            case 2:
                fabrica = new PaoDeMilhoConcretoFactory();
                pao = fabrica.criarPaoDeMilho();
                break;
            case 3:
                fabrica = new PaoIntegralConcretoFactory();
                pao = fabrica.criarPaoIntegral();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nVocê pediu um pão " + pao.getClass().getSimpleName() + ":");
        System.out.println("Ingredientes: " + pao.getIngredientes());
        System.out.println("Modo de Preparo: " + pao.getModoPreparo());
        System.out.println("Sabor: " + pao.getSabor());
    }
}
