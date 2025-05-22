
public class SugarDecorator extends AbstractHotDrinkDecorator{
	public HotDrink hotDrink;
	int count = 1;
	
	public SugarDecorator(HotDrink hotDrink) {
	this.hotDrink=hotDrink;
	}
	
	public SugarDecorator(HotDrink hotDrink, int count) {
		this.hotDrink=hotDrink;
		this.count=count;
		}

	@Override
	public String getHotDrinkDescription() {
	return hotDrink.getHotDrinkDescription()+" with "+count+" sugar";
	}

	@Override
	public int getPrice() {
	int modifiedPrice = hotDrink.getPrice() + count*5;
	return modifiedPrice;
	}
}

	

