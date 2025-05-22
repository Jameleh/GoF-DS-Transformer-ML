import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TipoDeOperaria extends Operarias{
    //COMPOSITE
    List<Abelha> op = new ArrayList<>();
    
    public TipoDeOperaria(Abelha... components){
        add(components);
    }
    
    public void add(Abelha component){
        op.add(component);
    }
    
    public void add(Abelha... components){
        op.addAll(Arrays.asList(components));
    }
    
    public void remove(Abelha component){
        op.remove(component);
    }
    
    public void remove(Abelha... components){
         op.removeAll(Arrays.asList(components));
    }
    
    public void LimparAlveolos(){
      //1 a 5 dias de vida: Limpeza de alvéolos;
      System.out.println("Alveolos limpos!");   
    }
    
    public void AlimentarLarvas(){
      //6 a 11 dias: Alimentação das larvas;
      System.out.println("Larvas alimentadas!");
    }
  
    public void ProduzirCera(){
      //12 a 18 dias: Produção de cera;
      System.out.println("Cera produzida!");
    }
  
    public void ProtegerColmeia(){
      //18 a 21 dias: Proteção da colmeia; 
      System.out.println("Colmeia protegida!");
    }
  
    public void ColetarAlimentos(){
      //21 a 42 dias (morte): Coleta de néctar, pólen, água e resinas.
      System.out.println("Alimento coletado!");
    }
  
    @Override
    public void Alimentar(){
        System.out.println("Abelha alimentada!");
    }
  
    @Override
    public void Voar(){
        System.out.println("Abelha voando!");
    }
  
    @Override
    public void Reproduzir(){
        System.out.println("Abelha reproduzindo!");
    }
}