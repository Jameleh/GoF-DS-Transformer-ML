public class Marcha{
    
    public void Embreagem(){
        System.out.println("Embreagem acionada!");
    }
    
    
    public void Caixa(int v){
        switch(v){
            case 10:
                Embreagem();
                System.out.println("Marcha 1!");
                break;
            case 20:
                Embreagem();
                System.out.println("Marcha 2!"); 
                break;
            case 30:
                Embreagem();
                System.out.println("Marcha 3!"); 
                break;
            case 40:
                Embreagem();
                System.out.println("Marcha 4!");
                break;
            case 50:
                Embreagem();
                System.out.println("Marcha 5!"); 
                break;
        }
    }
    
    public void Re(){
        Embreagem();
        System.out.println("Ré está acionada!");
    }
}