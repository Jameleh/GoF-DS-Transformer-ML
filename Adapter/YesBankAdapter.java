package adapter;

public class YesBankAdapter implements BankApi{
	//This YesBankAdapter is created via PhonePe
	//Since it is YesbankAdapter class which is implementing BankApi, we need to create object of YesBank and implement 
	//these method using YesBank
	
	YesBank yesBank=new YesBank();
	
	@Override
	public double checkBalance(String accountNumber) {
		return yesBank.getBalance(accountNumber);
		
	}

	@Override
	public void sendMoney(String from, String to, double amount) {
		
		yesBank.transferMoney(from, to, amount);
		
	}
	/*Instead of calling directly YesBank we have created a layer between PhonePe and YesBank, that is this adapter is connecting both of them.
	 * This YesBankAdepter class is connecting PhonePe and yesBank class.
	 */

}
