public class BrazilTaxVisitor implements TaxVisitorProtocol {
    @Override
    public double calculateTaxesForFood(Food food) {
        return (food.getPrice() + food.getPrice() * 0.05);
    }

    @Override
    public double calculateTaxesForCigarette(Cigarette cigarette) {
        return (cigarette.getPrice() + cigarette.getPrice() * 1.5);
    }

    @Override
    public double calculateTaxesForAlcoholicDrink(AlcoholicDrinks alcoholicDrink) {
        return (alcoholicDrink.getPrice() + alcoholicDrink.getPrice() * 1.25);
    }
}
