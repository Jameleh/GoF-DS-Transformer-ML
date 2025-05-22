public class Main{
  public static void main(String[] args){
      Carro fachada = new Carro();
      
      System.out.println("LIGANDO O CARRO!");
      fachada.ligarCarro();
      System.out.println("");
      fachada.reproduzirAudio("Olivia Rodrigo - Drivers License");
      
      System.out.println("");
      
      fachada.seta("direita");
      
      fachada.Acelerar(10);
      System.out.println("");
      
      System.out.println("DESLIGANDO CARRO!");
      
      fachada.desligarCarro();
  }
}