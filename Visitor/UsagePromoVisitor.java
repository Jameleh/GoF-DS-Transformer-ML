public class UsagePromoVisitor implements PromotionVisitor {
    @Override
    public String visit(Smart smart) {
        return new UsagePromo().showAllowance(smart.getTelcoName(), smart.getPromoPrice());
    }

    @Override
    public String visit(Globe globe) {
        return new UsagePromo().showAllowance(globe.getTelcoName(), globe.getPromoPrice());
    }

    @Override
    public String visit(Ditto ditto) {
        return new UsagePromo().showAllowance(ditto.getTelcoName(), ditto.getPromoPrice());
    }
}
