
public class SpacyDecorator extends IngredientDecorator{

	public SpacyDecorator(Sandwich s) {
		this.sandwich = s;
		this.decCost = 1;
		this.decName = "SpacySauce";
	}
	
	@Override
	public String getDescription() {

		return makeDescription(this.decName);
	}

	@Override
	public int getCost() {
		
		return this.sandwich.getCost() + this.decCost;
	}
	
	

}
