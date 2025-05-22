public class Colmeia{
 public static void main(String[] args){
     //CLIENTE
     AbelhaRainha abl = new AbelhaRainha();
     Zangao zga = new Zangao();
     TipoDeOperaria op = new TipoDeOperaria();
     
     abl.Voar();
     abl.Alimentar();
     abl.Reproduzir();
     
     System.out.println("-----------------------");
     System.out.println(abl.toString());
     System.out.println("-----------------------");
     
     zga.Voar();
     zga.Alimentar();
     zga.Reproduzir();
     
     System.out.println("-----------------------");
     System.out.println(zga.toString());
     System.out.println("-----------------------");
     
     op.add();
     op.remove();
     op.LimparAlveolos();
     op.AlimentarLarvas();
     op.ProduzirCera();
     op.ProtegerColmeia();
     op.ColetarAlimentos();
     op.Alimentar();
     op.Voar();
     op.Reproduzir();
     
 }   
}