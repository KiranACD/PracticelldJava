
public class PhonePe {

    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    public double doSomething() {
        double currentBalance = bankAPI.getBalance("accountNumber");
        //Thread.sleep(25*24*60*60*1000);
        return currentBalance;
    }
}