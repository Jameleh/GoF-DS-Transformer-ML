public class AbelhaRainha implements Abelha{
    //FOLHA
    boolean ferrao = true;
    String estrutura = "Super Grande";
    char sexo = 'F';
    int cor;
    
    @Override
    public int getCor(){
        return cor;
    }
  
    public void Alimentar(){
        System.out.println("Rainha alimentada!");
    }
    
    public void Voar(){
        System.out.println("Rainha voando!");
    }
    
    public void Reproduzir(){
        System.out.println("Rainha reproduzindo!");
    }
    
    public String toString(){
       return "- " + sexo + ";\n- " + estrutura + ";\n- " + ferrao + ".";
    }
}