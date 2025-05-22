package adapter;

public interface BankApi {
	//This BankApi is created via PhonePe

	double checkBalance(String accNumber);
	
	void sendMoney(String from,String to,double amount);
}
