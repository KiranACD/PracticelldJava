
import java.util.*;

public class Flipkart {

    private static Flipkart instance;
    private List<Subscriber> subscribers = new ArrayList<>();

    public static Flipkart getInstance() {
        if (Flipkart.instance == null) {
            Flipkart.instance = new Flipkart();
        } 
        return Flipkart.instance;
    }
    public void registerSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unregisterSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void orderPlaced() { 

        for (Subscriber subscriber: this.subscribers) {
            subscriber.announce();
        }
    }
}