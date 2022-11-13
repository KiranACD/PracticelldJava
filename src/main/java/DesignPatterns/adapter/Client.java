
public class Client {

    public static void main(String[] args) {
        BankAPIAdapter bankapiadapter = new YesBankAPIAdapter();
        PhonePe phonepe = new PhonePe(bankapiadapter);

        double balance = phonepe.doSomething();
        System.out.println(balance);
    }   
}