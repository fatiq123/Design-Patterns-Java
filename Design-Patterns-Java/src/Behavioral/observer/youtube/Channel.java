package Behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> sub = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber) {
        sub.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        sub.remove(subscriber);
    }

    public void notifySubscriber() {
        for (Subscriber subscriber : sub) {
            subscriber.upload();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }

}
