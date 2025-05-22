package strategy;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Programação Avançada - Padrão Strategy\n");
        CarroAcelera carro = new CarroAcelera(new MarchaUm());
	carro.acelerar();
		
	carro.setAcelerar(new MarchaQuatro());
	carro.acelerar();
		
	carro.setAcelerar(new MarchaRe());
	carro.acelerar();
        
        carro.setAcelerar(new MarchaUm());
	carro.acelerar();
    }
    
}
