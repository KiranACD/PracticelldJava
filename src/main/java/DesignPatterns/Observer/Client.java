
public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailSender emailsender = new EmailSender();
        InvoiceGenerator invoicegenerator = new InvoiceGenerator();

        flipkart.orderPlaced();
    }
}