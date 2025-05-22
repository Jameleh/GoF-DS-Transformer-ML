import Factory.ArvoreFactory;
import model.Arvore;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int quantidadeArvores = 1000000;
        int quantidadeVerde = quantidadeArvores / 2;
        int quantidadeVermelho = quantidadeArvores / 2;

        Random random = new Random();
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Criando e exibindo as árvores:");

        for (int i = 0; i < quantidadeVerde; i++) {
            Arvore arvore = ArvoreFactory.getArvore("Ornamentais", "verde");
            arvore.exibirArvore();
        }

        for (int i = 0; i < quantidadeVermelho; i++) {
            Arvore arvore = ArvoreFactory.getArvore("Frutíferas", "vermelho");
            arvore.exibirArvore();
        }

        long memoriaUtilizada = (runtime.totalMemory() - runtime.freeMemory());

        System.out.println(memoriaUtilizada);
    }
}