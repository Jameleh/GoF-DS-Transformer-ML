public class Zangao implements Abelha{
  //FOLHA
  boolean ferrao = false;
  String estrutura = "Não possuem estrutura para trabalho; Apresentam órgãos olfatórios, sensoriais e musculatura bem desenvolvidos; Possuem assas maiores.";
  char sexo = 'M';
  int cor;
  
  @Override
  public int getCor(){
      return cor;
  }
  
  public void Alimentar(){
      System.out.println("Zangão alimentado!");
  }
  
  public void Voar(){
    System.out.println("Zangão voando!");
  }
    
  public void Reproduzir(){
    System.out.println("Zangão reproduzindo!");
  }
  
  public String toString(){
      return "- " + sexo + ";\n- " + estrutura + ";\n- " + ferrao + ".";
  }
}