package prototype;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
        Lago a1 = new Lago(100f, 200f, 50f);
        Lago a2 = new Lago(58.6f, 75.8f, 30.5f);
        Arvore b1 = new Arvore("Coqueiro", 5f);
        Arvore b2 = new Arvore("Seringueira", 30f);
        Folhagem c1 = new Folhagem("Ceropegia", "Verde");
        Folhagem c2 = new Folhagem("Coleus", "Roxo");
        Ponte d1 = new Ponte(100f, 500f);
        Ponte d2 = new Ponte(120f, 1800f);
        
        System.out.println("Programação Avançada - Padrão Prototype\n");
        
        List<Lago> lista = new ArrayList<Lago>();
           lista.add(a1);
           lista.add(new Lago(a1));
           lista.add(new Lago(a1));
           lista.add(new Lago(a1));
           lista.add(a2);
           lista.add(new Lago(a2));
           lista.add(new Lago(a2));
           lista.add(new Lago(a2));

           for (Lago lago : lista) {
               System.out.println("Lago");
               System.out.println("ID: " + lago.id + "| " + lago.largura + " Metros de Largura " + lago.comprimento + " Metros de Comprimento " + lago.profundidade + " Metros de Profundidade");
        }
           System.out.println("-------------------------------------------");
           System.out.println("");
           List<Arvore> lista2 = new ArrayList<Arvore>();
           lista2.add(b1);
           lista2.add(new Arvore(b1));
           lista2.add(new Arvore(b1));
           lista2.add(new Arvore(b1));
           lista2.add(b2);
           lista2.add(new Arvore(b2));
           lista2.add(new Arvore(b2));
           lista2.add(new Arvore(b2));

           for (Arvore arvore : lista2) {
               System.out.println("Arvore");
               System.out.println("ID: " + arvore.id + "| Espécie " + arvore.especie + " " + arvore.altura + " Metros de Altura");
        }
           System.out.println("-------------------------------------------");
           System.out.println("");
           List<Folhagem> lista3 = new ArrayList<Folhagem>();
           lista3.add(c1);
           lista3.add(new Folhagem(c1));
           lista3.add(new Folhagem(c1));
           lista3.add(new Folhagem(c1));
           lista3.add(c2);
           lista3.add(new Folhagem(c2));
           lista3.add(new Folhagem(c2));
           lista3.add(new Folhagem(c2));

           for (Folhagem folhagem : lista3) {
               System.out.println("Folhagem");
               System.out.println("ID: " + folhagem.id + "| Espécie " + folhagem.especie + " Cor " + folhagem.cor);
        }
           System.out.println("-------------------------------------------");
           System.out.println("");
           List<Ponte> lista4 = new ArrayList<Ponte>();
           lista4.add(d1);
           lista4.add(new Ponte(d1));
           lista4.add(new Ponte(d1));
           lista4.add(new Ponte(d1));
           lista4.add(d2);
           lista4.add(new Ponte(d2));
           lista4.add(new Ponte(d2));
           lista4.add(new Ponte(d2));

           for (Ponte ponte : lista4) {
               System.out.println("Ponte");
               System.out.println("ID: " + ponte.id + "| " + ponte.largura + " Metros de Largura " + ponte.comprimento + " Metros de Comprimento");
        }   
    }
    
}
