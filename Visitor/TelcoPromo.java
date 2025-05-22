public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Smart(15, 500);
        TelcoSubscription globe = new Globe(10, 450);
        TelcoSubscription ditto = new Ditto(8, 400);

        Promotion promo = new UsagePromo();
        PromotionVisitor visitor = new UsagePromoVisitor();

        System.out.println(promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println(promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println(promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println(visitor.visit(smart));
        System.out.println(visitor.visit(globe));
        System.out.println(visitor.visit(ditto));
    }
}
