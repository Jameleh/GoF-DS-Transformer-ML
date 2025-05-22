public class ProviderB implements PaymentService {

    PaymentAdapter paymentAdapter;

    @Override
    public void processPayment(String coin, double value) {
        if (coin.equalsIgnoreCase("Mxn")){
            System.out.println("Payment: "+ value + " " + coin);
        }
        else if (coin.equalsIgnoreCase("Us") || coin.equalsIgnoreCase("Eu")){
            paymentAdapter = new PaymentAdapter(coin, value);
            paymentAdapter.processPayment(coin, value);
        }

    }
}
