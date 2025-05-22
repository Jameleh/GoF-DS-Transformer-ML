public class UnliCallTextPromoVisitor implements PromotionVisitor {
    @Override
    public String visit(Smart smart) {
        return new UnliCallOffer().showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText());
    }

    @Override
    public String visit(Globe globe) {
        return new UnliCallOffer().showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText());
    }

    @Override
    public String visit(Ditto ditto) {
        return new UnliCallOffer().showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText());
    }
}
