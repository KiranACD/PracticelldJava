
//import src.main.java.DesignPatterns.adapter.thirdpartyapis.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBankAPI icicibankAPI = new ICICIBankAPI();

    public double getBalance(String accountNumber) {

        //String balance = icicibankAPI.getBalance();
        //double doubleBalance = Double.parseDouble(balance);
        //return doubleBalance;
        return 0;
    }

    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}