package br.edu.ifnmg.aluno.ghar;

public class FlyweightPattern {

   /* final String formatos[]
    * É o nosso vetor de possiveis formatos que nossos objetos possam ter, vamos 'sortear' um valor dele por vez para a fábrica de objetos flyweight
    * caso já exista um flyweight do formato passado ele criará um novo objeto apenas referência do flyweight, caso não ele criará um novo flyweight
    * sorteamos um formato pelo método 'getRandomFormato()' e passamos o formato para o objeto 'figura' pelo método da fábrica 'getFigure'
    */
   private static final String formatos[] = { "Circulo", "Triangulo", "Quadrado", "Pentagono", "Hexagono", "Heptagono", "Octogono", "Eneagono", "Decagono" };
   public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Figura figura = (Figura)FiguraFactory.getFigura(getRandomFormato());
         figura.setX(getRandomX());
         figura.setY(getRandomY());
         figura.escreve();
      }
   }

   /* static String getRandomFormato()
    * busca um valor aleatório no escopo do nosso vetor de formatos
    */
   private static String getRandomFormato() {
      return formatos[(int)(Math.random()*formatos.length)];
   }

   /* static int getRandomX()
    * sorteia um valor entre 0 e 99 para X, para incluirmos ele em um ponto do nosso plano cartesiano fictício
    */
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }

   /* static int getRandomY()
    * sorteia um valor entre 0 e 99 para Y, para incluirmos ele em um ponto do nosso plano cartesiano fictício
    */
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}