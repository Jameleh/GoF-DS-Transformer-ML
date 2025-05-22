package adapter;

public class IciciAdapter implements BankApi {

	IciciBank icicibank=new IciciBank();
	@Override
	public double checkBalance(String accNumber) {
		
		return icicibank.showBalance(accNumber);
	}

	@Override
	public void sendMoney(String from, String to, double amount) {
		
		icicibank.moveMoney(from, to, amount);
	}

}
