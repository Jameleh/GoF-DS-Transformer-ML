public class Main {
    public static void main(String[] args) {
        final OrderFacade orderFacade = new OrderFacade();

        orderFacade.createOrder("ProductId", "PaymentDetails", "ShippingAddress");
    }
}