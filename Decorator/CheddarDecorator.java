
public class CheddarDecorator extends IngredientDecorator{
	public CheddarDecorator(Sandwich s) {
		this.sandwich = s;
		this.decCost = 2;
		this.decName = "Cheddar";
		
	}

}
