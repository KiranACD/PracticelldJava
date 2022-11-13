
//import src.main.java.DesignPatterns.adapter.thirdpartyapis.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private YesBankAPI yesBankAPI = new YesBankAPI();

    public double getBalance(String accountNumber) {

        //String balance = yesBankAPI.getBalance();
        //double doubleBalance = Double.parseDouble(balance);
        //return doubleBalance;
        return 0;
    }

    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}