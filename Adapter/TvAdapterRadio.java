
public class TvAdapterRadio implements Tv {
	Radio radio;
	
	public TvAdapterRadio(Radio r) {
		this.radio = r;
	}

	@Override
	public void turnOn() {
		radio.prender();
		
	}

	@Override
	public void turnOff() {
		radio.apagar();
		
	}

	@Override
	public void subirCanal() {
		radio.aumnetarFrec();
		
	}

	@Override
	public void bajarCanal() {
		radio.disminFrec();
		
	}

	@Override
	public void subirVolumen() {
		radio.subirVol();
		
	}

	@Override
	public void bajarVolumen() {
		radio.bajarVol();
		
	}

	@Override
	public void setChannel(int i) {
		int currentFrec = radio.getFrecuencia();
		if(currentFrec > i) {
			radio.aumnetarFrec();
		}
		else if(currentFrec < i) {
			radio.disminFrec();
		}
		
		
	}
}
