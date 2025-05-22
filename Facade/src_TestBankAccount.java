public class TestBankAccount {

    public static void main(String[] args){

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

        // the whole net result of the facade is that facade object is created and user creates their account number
        // and security code. then you simply ask to withdraw or deposit money and the inner workings of the code does
        // all tthe checking in the backgrround for security check, account number and balance check, welcomes you to
        // the bank, etc. requires no effort from user to do those actions

    }

}