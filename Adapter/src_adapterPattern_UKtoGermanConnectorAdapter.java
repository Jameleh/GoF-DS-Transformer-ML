package adapterPattern;

public class UKtoGermanConnectorAdapter implements GermanPlugConnector
{
	private UKPlugConnector plug;
	public UKtoGermanConnectorAdapter(UKPlugConnector plug) 
	{
		this.plug = plug;   
	}     
	@Override     
	public void giveElectricity() 
	{
		plug.provideElectricity();     
	} 
}


