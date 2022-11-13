
public class InvoiceGenerator implements Subscriber {

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    public void announce() {
        this.generateInvoice();
    }

    public void generateInvoice() {
        System.out.println("Order placed! Generate invoice...");
    }    
}