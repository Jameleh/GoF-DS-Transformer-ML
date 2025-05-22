public class PaymentAdapter implements PaymentService{

    ProviderA providerA;

    public PaymentAdapter(String coin, double value){
        if (coin.equalsIgnoreCase("Eu") || coin.equalsIgnoreCase("Us")){
            providerA = new ProviderA();
        }
    }

    @Override
    public void processPayment(String coin, double value){
        if (coin.equalsIgnoreCase("Us")){
            providerA.processPaymentUs(value);
        }
        else if (coin.equalsIgnoreCase("Eu")){
            providerA.processPaymentEu(value);
        }
    }

}
