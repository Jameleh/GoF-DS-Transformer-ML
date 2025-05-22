public interface PromotionVisitor {
    String visit(Smart smart);
    String visit(Globe globe);
    String visit(Ditto ditto);
}
