public class App {
    public static void main(String[] args) throws Exception {
        Food food = new Food(10);
        Cigarette cigarette = new Cigarette(5);
        AlcoholicDrinks alcoholicDrinks = new AlcoholicDrinks(7);

        BrazilTaxVisitor brazilTaxVisitor = new BrazilTaxVisitor();

        VisitableProducts[] cart = {food, cigarette, alcoholicDrinks};

        double total = 0;
        double totalWithTaxesBrazil = 0;

        for (VisitableProducts i : cart ) {
            total += i.getPrice();
        }
        for (VisitableProducts i : cart) {
            totalWithTaxesBrazil += i.getPriceWithTaxe(brazilTaxVisitor);
        }

        System.out.println(total);
        System.out.println(totalWithTaxesBrazil);
    }

}