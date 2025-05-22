
public class MainAdapter {

	public static void main(String[] args) {
		Tv tv1 = new SamsungTv();
		Radio radio = new RadioMesa();
		
		Tv tvTest = new TvAdapterRadio(radio);
		
		System.out.println("\nThis is a real tv:\n");
		testTv(tv1);
		
		System.out.println("This is a fake tv:\n");
		testTv(tvTest);
	}
	static void testTv(Tv tv) {
		tv.turnOn();
		tv.subirCanal();
		tv.bajarCanal();
		tv.subirVolumen();
		tv.subirVolumen();
		tv.bajarVolumen();
		tv.turnOff();
	}

}
