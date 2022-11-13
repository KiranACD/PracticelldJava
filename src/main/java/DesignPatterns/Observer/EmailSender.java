
public class EmailSender implements Subscriber {

    public EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    public void announce() {
        this.sendEmail();
    }
    
    public void sendEmail() {
        System.out.println("Order placed! Send email...");
    }
}