public class AlcoholicDrinks extends VisitableProducts {
  public AlcoholicDrinks(double price){
      super("AlcoholicDrinks", price);
  };   

  @Override
  double getPriceWithTaxe(TaxVisitorProtocol visitor) {
      return visitor.calculateTaxesForAlcoholicDrink(this);
  }
};
