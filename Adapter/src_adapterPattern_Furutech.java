package adapterPattern;

public class Furutech implements UKPlugConnector
{
	public void provideElectricity()
	{
		System.out.println("Providing electricity to the Furutech plug");
	}
}
