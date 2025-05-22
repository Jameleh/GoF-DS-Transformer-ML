public class Carro{
    protected Motor motor;
    protected Direcao direcao;
    protected Freio freio;
    protected ArCondicionado arCondicionado;
    protected Marcha marcha;
    protected Som som;
    
    public void ligarCarro(){
        motor = new Motor();
        motor.ligar();
        
        arCondicionado = new ArCondicionado();
        arCondicionado.arLigado();
        
        freio  = new Freio();
        freio.abaixado();
        
        som  =  new Som();
        som.ligarSom();
        som.configurarVolume();
        
        new Direcao();
        new Marcha();
    }
    
    public void desligarCarro(){
        motor = new Motor();
        motor.desligar();
        
        arCondicionado = new ArCondicionado();
        arCondicionado.arDesligado();
        
        freio  = new Freio();
        freio.levantado();
        
        som  =  new Som();
        som.desligarSom();
    }
    
    public void reproduzirAudio(String musica) { 
        som.reproduzirSom(musica);    
    }
    
    public void seta(String d){
        direcao  = new Direcao();
        if(d.equalsIgnoreCase("direita")){
            direcao.setaDireita();
        }else if(d.equalsIgnoreCase("esquerda")){
            direcao.setaEsquerda();
        }
    }
    
    
    public void Acelerar(int v){
        marcha = new Marcha();
        marcha.Caixa(v);
    }
}