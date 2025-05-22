package adapter;

public class IciciBank {

	//3rd party class
		void moveMoney(String from, String to, double amount)
		{
			System.out.println("IciciBank | Sending "+amount +from+ "account to"+to+"account.");
		}
		double showBalance(String accountNumber)
		{
			System.out.println("IciciBank | Balance of "+accountNumber+"is"+100);
			return 100;
		}
}
