public interface TaxVisitorProtocol {
    public double calculateTaxesForFood(Food food);
    public double calculateTaxesForCigarette(Cigarette cigarette);
    public double calculateTaxesForAlcoholicDrink(AlcoholicDrinks alcoholicDrink);
}
