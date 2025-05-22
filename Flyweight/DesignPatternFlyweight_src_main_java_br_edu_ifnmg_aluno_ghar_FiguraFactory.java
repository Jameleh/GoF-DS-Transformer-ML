package br.edu.ifnmg.aluno.ghar;

import java.util.HashMap;

/* class FiguraFactory
 * nossa fábrica de figuras, aqui implementamos a library 'HashMap', que serve para armazenar uma chave e sua referência, assim podemos criar nossos flyweights e teremos
 * um sistema de busca e criação de flyweights. Sempre que criamos uma nova figura pelo método 'getFigura()' nós fazemos a verificação se ela já existe como flyweight ou não
 * utilizando o método 'get' da nossa biblioteca. Recebemos os parâmetros do nosso flyweight como final, já que nessa estrutura ele não pode ser alterado de maneira alguma
 */
public class FiguraFactory {
   private static final HashMap<String, Figura> figuraMapa = new HashMap<String, Figura>();

   public static Forma getFigura(final String formato) {
      Figura figura = (Figura)figuraMapa.get(formato);

      if(figura == null) {
         figura = new Figura(formato);
         figuraMapa.put(formato, figura);
         System.out.println("\n--- Criação de uma nova formato: " + formato + " ---\n");
      }
      return figura;
   }
}
