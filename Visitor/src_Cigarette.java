public class Cigarette extends VisitableProducts {
    public Cigarette(double price){
        super("Cigarette", price);
    };

    @Override
    double getPriceWithTaxe(TaxVisitorProtocol visitor) {
        return visitor.calculateTaxesForCigarette(this);
    }
};
