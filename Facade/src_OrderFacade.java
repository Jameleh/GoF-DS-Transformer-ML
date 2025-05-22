public class OrderFacade {
    private final PaymentService paymentService;
    private final InventoryService inventoryService;

    private final ShippingService shippingService;

    public OrderFacade() {
        this.paymentService = new PaymentService();
        this.inventoryService = new InventoryService();
        this.shippingService = new ShippingService();
    }

    public void createOrder(String productId, String paymentDetails, String shippingAddress) {
        if (inventoryService.checkStock(productId)) {
            shippingService.addShippingAddress(shippingAddress);
            inventoryService.reduceStock(productId);
            paymentService.processPayment(paymentDetails);
            System.out.println("Successfully placed the order");
        } else {
            System.out.println("Product is out of stock");
        }
    }
}
