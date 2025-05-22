
public class IngredientDecorator extends Sandwich {
	Sandwich sandwich;
	int decCost;
	String decName;
	
	public int getCost() {
		return this.sandwich.getCost() + this.decCost;
	}
	public String makeDescription(String string) {
		return this.sandwich.getDescription() + "\t-"+this.decName+"\t$"+this.decCost+"\n";
	}
	public String getDescription() {
		return makeDescription(this.decName);
	}

}
