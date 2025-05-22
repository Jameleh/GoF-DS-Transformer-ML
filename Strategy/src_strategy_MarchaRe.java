package strategy;
/**
 *
 * @author Ygor
 */
public class MarchaRe implements Marcha{
        @Override
	public void acelerar(CarroAcelera carroacelera){
		System.out.println("Na marcha ré o carro anda devagar, com força e para trás");
	}
}
