public abstract class VisitableProducts {
    protected double price;
    protected String name;

    public VisitableProducts( String name, double price ) {
        this.setName(name);
        this.setPrice(price);
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null)
			this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if(price > 0)
			this.price = price;
    }

    abstract double getPriceWithTaxe(TaxVisitorProtocol visitor);
}
