
public class BreathDecorator extends IngredientDecorator {
	
	
	public BreathDecorator(Sandwich s) {
		this.sandwich = s;
		this.decCost = 2;
		this.decName = "Breath\t";
	}


}
