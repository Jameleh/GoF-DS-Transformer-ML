package DesignPatterns_Facade;



public class FazCombo extends Produto 
{
    private Bebida bebida = new Bebida();
    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();
    private int tipo;


  
    public void Combos(int escolha) {
     
     tipo = escolha;

       
        // PAra que possa escolher

        
     
        if (escolha == 1) {
         

           System.out.println("\n Você escolheu o combo " + tipo );   
            burguer.setGramas(250);
            burguer.setDescricao("Hamburguer Duplo");
            burguer.setPreco(8.99);
            sobremesa.setTamanho("Grande");
            sobremesa.setDescricao("Sundae");
            sobremesa.setPreco(7.00);
            bebida.setMl(350);
            bebida.setDescricao("Coca-Cola");
            bebida.setPreco(6.99); 
            
            
            System.out.println("\n ***** Duplo Completo*****\n");

        } else if (escolha == 2)  {

            System.out.println("\n Você escolheu o combo " + tipo  );   
            burguer.setGramas(250);
            burguer.setDescricao("Vegetariano");
            burguer.setPreco(12.00);
            sobremesa.setTamanho("Médio");
            sobremesa.setDescricao("Sorvete");
            sobremesa.setPreco(6.00);
             bebida.setMl(400);
            bebida.setDescricao("Suco");
            bebida.setPreco(9.00); 
            
            
            System.out.println("\n ***** Vegetariano ***** \n");
        
        }else 
        {
            System.out.println("\nOpção inválida. Por favor, escolha 1 ou 2.");
        }


    }


    @Override
    //substituindo ou sobrescrevendo um método (pesquisar)
    public String toString() 
    {

        return         
        "Lanche: " + burguer.getDescricao() + "\t" + burguer.getGramas() + " g\n"  + 
        "Bebida: " + bebida.getDescricao() + "\t\t" + bebida.getMl() + " ml\n" + 
        "Sobremesa: " + sobremesa.getDescricao() + "\t" + sobremesa.getTamanho() +  "\n\n" +


        "\nValor Unitário:" +

        String.format("\n\t\t\t\t\tR$%.2f%n", burguer.getPreco()) +
        String.format("\n\t\t\t\t\tR$%.2f%n", bebida.getPreco() ) +
        String.format("\n\t\t\t\t\tR$%.2f%n", sobremesa.getPreco()) +
        String.format("\n\nValor total: \t\t\tR$%.2f%n", (sobremesa.getPreco() + burguer.getPreco() + bebida.getPreco()));
      
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public void setBurguer(Burguer burguer) {
        this.burguer = burguer;
    }

    public void setSobremesa(Sobremesa sobremesa) {
        this.sobremesa = sobremesa;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


}