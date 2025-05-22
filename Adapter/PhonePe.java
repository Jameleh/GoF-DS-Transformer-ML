package adapter;

public class PhonePe {
	//PhonePe will create an Interface to connect with 3rd part API.
	
	
	//Option1-1  we can connect YesBank class with PhonePe by creating object of YesBank in this class.
	//This approach is possible but its tight coupling(its hard dependency on YesBank class) so not a good Idea.
//	YesBank yesBank=new YesBank();
//	
//	void transferMoney(String a,String b,double amount)
//	{
//		yesBank.transferMoney(a, b, 100);
//	}
	//Note: In place of using this we will create YesBankAdapter class and implements BankApi interface
	
	
	//BankApi bankApi=new YesBankAdapter();//Here reference is BankApi and Object we are storing in YesBankAdapter.
	BankApi bankApi=new IciciAdapter();//If we want to change bank just change here in place of YesBakAdapter use IciciAdapter
	public void sendMoney(String acc1,String acc2,double x)
	{
		bankApi.sendMoney(acc1, acc2, x);
	}
	public double checkBalance(String acc)
	{
		return bankApi.checkBalance(acc);
	}
	
	

}
