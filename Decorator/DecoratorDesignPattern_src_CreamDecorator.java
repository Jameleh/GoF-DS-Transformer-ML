
public class CreamDecorator extends AbstractHotDrinkDecorator{
	public HotDrink hotDrink;
	int count = 1;
	String cream = " cream";
	
	public CreamDecorator(HotDrink hotDrink) {
	this.hotDrink=hotDrink;
	}
	
	public CreamDecorator(HotDrink hotDrink, int count) {
		this.hotDrink=hotDrink;
		this.count=count;
		}

	@Override
	public String getHotDrinkDescription() {
	if(count>1)cream=cream+"s";
	return hotDrink.getHotDrinkDescription()+" with "+count+cream;
	}

	@Override
	public int getPrice() {
	int modifiedPrice = hotDrink.getPrice() + count*10;
	return modifiedPrice;
	}
}
