public class Food extends VisitableProducts {
  public Food(double price){
    super("Food", price);
  }; 

  @Override
  double getPriceWithTaxe(TaxVisitorProtocol visitor) {
      return visitor.calculateTaxesForFood(this);
  };
};
