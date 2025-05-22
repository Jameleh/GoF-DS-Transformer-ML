package strategy;
/**
 *
 * @author Ygor
 */
public class CarroAcelera {
    	private Marcha marcha;
	
	public CarroAcelera(Marcha marcha) {
		this.marcha = marcha;
	}
	
	public void acelerar() {
		marcha.acelerar(this);
	}
	
	public void setAcelerar(Marcha marcha) {
		this.marcha = marcha;
	}
}
