
public class LettuceDecorator extends IngredientDecorator{
	public LettuceDecorator(Sandwich s) {
		this.sandwich = s;
		this.decCost = 1;
		this.decName = "Lettuce";
		
	}

}
